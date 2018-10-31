package com.beisun.vmscloud.service.impl;


import com.beisun.vmscloud.dao.m450000.Mapper450000;
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

public class ServiceImpl450000 implements IBillCheckService {


    @Autowired
    Mapper450000 mapper;
    @Autowired
    IBaseService iBaseService;
    //本省机构号
    private @Getter @Setter String Pbranch_no = "450000";

    /**
     *  创建待核销任务
     * @param inputparam
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(value = "tx450000", propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Outputparam createJob(Inputparam inputparam) throws Exception{

        return iBaseService.createJob(mapper,"insert",Pbranch_no,inputparam);
    }
}
