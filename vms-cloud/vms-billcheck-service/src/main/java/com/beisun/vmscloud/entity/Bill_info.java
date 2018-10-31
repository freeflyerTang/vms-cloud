package com.beisun.vmscloud.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-21 16:04
 * @description 单证信息
 **/
public class Bill_info {
    // 单证信息列表
    private List<Bill_info_sub> bill_info_sub;

    public List<Bill_info_sub> getBill_info_sub() {
        return bill_info_sub;
    }

    public void setBill_info_sub(List<Bill_info_sub> bill_info_sub) {
        this.bill_info_sub = bill_info_sub;
    }
}
