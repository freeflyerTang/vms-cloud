package com.beisun.vmscloud.entity;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-21 16:00
 * @description 单证信息循环开始节点
 **/
public class Bill_info_sub {
    // 单证代码
    private String bill_class;
    // 单证号
    private String bill_no;
    // 核销日期
    private String chk_date;
    // 保单号
    private String cont_no;
    // 证件单证核销状态
    private String check_flag;

    public String getBill_class() {
        return bill_class;
    }

    public String getBill_no() {
        return bill_no;
    }

    public String getChk_date() {
        return chk_date;
    }

    public String getCont_no() {
        return cont_no;
    }

    public String getCheck_flag() {
        return check_flag;
    }

    public void setBill_class(String bill_class) {
        this.bill_class = bill_class;
    }

    public void setBill_no(String bill_no) {
        this.bill_no = bill_no;
    }

    public void setChk_date(String chk_date) {
        this.chk_date = chk_date;
    }

    public void setCont_no(String cont_no) {
        this.cont_no = cont_no;
    }

    public void setCheck_flag(String check_flag) {
        this.check_flag = check_flag;
    }
}
