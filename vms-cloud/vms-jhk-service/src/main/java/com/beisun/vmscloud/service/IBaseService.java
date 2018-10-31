package com.beisun.vmscloud.service;

import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Outputparam;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-30 16:35
 * @description 基础接口
 **/
public interface IBaseService {
    public <T> Outputparam createJob(T mapper, String method,String branch_no,Inputparam inputparam)throws Exception;;
}
