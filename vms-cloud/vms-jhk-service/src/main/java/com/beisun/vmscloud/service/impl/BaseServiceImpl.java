package com.beisun.vmscloud.service.impl;

import com.alibaba.fastjson.JSON;
import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Job_check;
import com.beisun.vmscloud.entity.Outputparam;
import com.beisun.vmscloud.entity.enumutil.Job_status;
import com.beisun.vmscloud.service.IBaseService;
import com.beisun.vmscloud.util.BranchUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-30 16:38
 * @description 功能：所有数据处理方法实现代码,不进行事务处理。 各省的Service注入BaseService，注入
 *         各省自己的mapper,并指定各省独立的事务处理器
 **/
@Service
public class BaseServiceImpl implements IBaseService{
    Logger log = LoggerFactory.getLogger(BaseServiceImpl.class);
    //格式化时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");

    @Override
    public <T> Outputparam createJob(T mapper, String method, String branch_no, Inputparam inputparam) throws Exception {
        Outputparam outputparam  = new Outputparam();
        if (inputparam!=null) {
            // 获取请求json
            String job_json = JSON.toJSONString(inputparam);

            Date current_date = new Date();
            // 获取任务创建时间
            String job_create = sdf.format(current_date);
            //获取省级机构号
            String mngBranchNo = BranchUtil.getMngBranch(inputparam.getBranchno());
            // 定义待核销任务对象(job_worknode = 1 表示接收请求节点)
            Job_check job_check = new Job_check(Job_status.JOB_START.toString(),
                    job_create, "接收请求成功", "1",
                    job_json, inputparam.getBill_number(), mngBranchNo);

            Method m = null;
            try {
                m = mapper.getClass().getMethod(method,Job_check.class);
            } catch (Exception e) {
                log.error("["+branch_no+"-Method获取异常]"+e.getMessage());
            }
            try{
                m.invoke(mapper,job_check);
                outputparam.setReturn_code("0000");
                outputparam.setReturn_info("接收请求成功！");

            }catch (Exception e) {
                outputparam.setReturn_code("0002");
                outputparam.setReturn_info("请求json保存失败！"+e.getMessage());
                log.error("["+branch_no+"-处理核销数据异常]"+e.getMessage());
                throw new Exception("激活卡核销服务后台处理错误,请联系管理员");
            }
        }else {
            outputparam.setReturn_code("0001");
            outputparam.setReturn_info("请求参数为空！");
        }


        return outputparam;
    }


}
