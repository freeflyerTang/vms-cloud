package com.beisun.vmscloud.entity;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-21 15:57
 * @description json请求对象
 **/
public class Inputparam {
    // 同步日期
    private String synchro_date;
    // 单证号数量
    private int bill_number;
    // 单证信息
    private Bill_info bill_info;
    // 调用机构
    private String branchno;

    public void setSynchro_date(String synchro_date) {
        this.synchro_date = synchro_date;
    }

    public void setBill_number(int bill_number) {
        this.bill_number = bill_number;
    }

    public void setBill_info(Bill_info bill_info) {
        this.bill_info = bill_info;
    }

    public String getSynchro_date() {
        return synchro_date;
    }

    public int getBill_number() {
        return bill_number;
    }

    public Bill_info getBill_info() {
        return bill_info;
    }

    public String getBranchno() {
        return branchno;
    }

    public void setBranchno(String branchno) {
        this.branchno = branchno;
    }
}
