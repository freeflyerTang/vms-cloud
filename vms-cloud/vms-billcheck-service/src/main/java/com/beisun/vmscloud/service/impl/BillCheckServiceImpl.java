package com.beisun.vmscloud.service.impl;

import com.alibaba.fastjson.JSON;
import com.beisun.vmscloud.dao.IBillCheck;
import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Job_check;
import com.beisun.vmscloud.entity.Outputparam;
import com.beisun.vmscloud.entity.enumutil.Job_status;
import com.beisun.vmscloud.service.IBillCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-25 16:16
 * @description 接口实现
 **/
@Service
@Transactional
public class BillCheckServiceImpl implements IBillCheckService {
    //格式化时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");

    @Autowired
    private IBillCheck BillCheckMapper;


    /**
     * @description  创建待核销任务
     * @param  [inputparam]
     * @return  void
     * @author  Carol Tang
     * @date  2018/9/26
     **/
    @Override
    public Outputparam createJob(Inputparam inputparam) {
        Outputparam outputparam  = new Outputparam();
        if (inputparam!=null){
            // 获取请求json
            String job_json = JSON.toJSONString(inputparam);

            Date current_date = new Date();
            // 获取任务创建时间
            String job_create = sdf.format(current_date);

            // 定义待核销任务对象(job_worknode = 1 表示接收请求节点)
            Job_check job_check = new Job_check(Job_status.JOB_START.toString(),
                    job_create,"接收请求成功","1",
                    job_json , inputparam.getBill_number(), inputparam.getBranchno());
            try {
                // 插入待核销任务
                BillCheckMapper.insert(job_check);
                outputparam.setReturn_code("0000");
                outputparam.setReturn_info("接收请求成功！");
            }catch (Exception e){
                outputparam.setReturn_code("0002");
                outputparam.setReturn_info("请求json保存失败！"+e.getMessage());
            }

        }else {
            outputparam.setReturn_code("0001");
            outputparam.setReturn_info("请求参数为空！");
        }
        return outputparam;
    }
}
