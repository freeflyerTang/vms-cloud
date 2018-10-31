package com.beisun.vmscloud.service;

import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Outputparam;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-25 16:15
 * @description 接口层
 **/
public interface IBillCheckService {
    public Outputparam createJob(Inputparam inputparam)throws Exception;
}
