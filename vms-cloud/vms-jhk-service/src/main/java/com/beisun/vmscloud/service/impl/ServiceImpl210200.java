package com.beisun.vmscloud.service.impl;


import com.beisun.vmscloud.dao.m210200.Mapper210200;
import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Outputparam;
import com.beisun.vmscloud.service.IBaseService;
import com.beisun.vmscloud.service.IBillCheckService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-25 16:16
 * @description 接口实现
 **/

public class ServiceImpl210200 implements IBillCheckService {


    @Autowired
    Mapper210200 mapper;
    @Autowired
    IBaseService iBaseService;
    //本省机构号
    private @Getter @Setter String Pbranch_no = "210200";

    /**
     *  创建待核销任务
     * @param inputparam
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(value = "tx210200", propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Outputparam createJob(Inputparam inputparam) throws Exception{

        return iBaseService.createJob(mapper,"insert",Pbranch_no,inputparam);
    }
}
