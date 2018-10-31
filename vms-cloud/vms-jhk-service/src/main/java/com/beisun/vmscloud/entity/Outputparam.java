package com.beisun.vmscloud.entity;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-21 16:07
 * @description json返回对象
 **/
public class Outputparam {
    // 返回值
    private String return_code;
    // 返回信息
    private String return_info;
    // 交易流水号
    private String tranno;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_info() {
        return return_info;
    }

    public void setReturn_info(String return_info) {
        this.return_info = return_info;
    }

    public String getTranno() {
        return tranno;
    }

    public void setTranno(String tranno) {
        this.tranno = tranno;
    }

    public Outputparam(String return_code, String return_info, String tranno) {
        this.return_code = return_code;
        this.return_info = return_info;
        this.tranno = tranno;
    }

    public Outputparam(){}
}
