package com.beisun.vmscloud.dao;

import com.beisun.vmscloud.entity.Job_check;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-25 14:47
 * @description 接口
 **/

public interface BillCheckMapper {
    // 插入核销任务
    int insert(Job_check job_check);
}
