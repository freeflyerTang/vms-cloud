package com.beisun.vmscloud.entity;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-25 13:28
 * @description 核销任务表
 **/
public class Job_check {
    // 任务号
    private int job_id;
    // 任务状态
    private String job_status;
    // 任务创建时间
    private String job_create;
    // 任务处理开始时间
    private String job_start;
    // 任务处理结束时间
    private String job_end;
    // 任务描述
    private String job_detail;
    // 任务节点
    private String job_worknode;
    // 请求数据json
    private String job_json;
    // 单证数量
    private int bill_num;
    // 机构号
    private String branchno;
    // 交易流水号
    private String tranno;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getJob_status() {
        return job_status;
    }

    public void setJob_status(String job_status) {
        this.job_status = job_status;
    }

    public String getJob_create() {
        return job_create;
    }

    public void setJob_create(String job_create) {
        this.job_create = job_create;
    }

    public String getJob_start() {
        return job_start;
    }

    public void setJob_start(String job_start) {
        this.job_start = job_start;
    }

    public String getJob_end() {
        return job_end;
    }

    public void setJob_end(String job_end) {
        this.job_end = job_end;
    }

    public String getJob_detail() {
        return job_detail;
    }

    public void setJob_detail(String job_detail) {
        this.job_detail = job_detail;
    }

    public String getJob_worknode() {
        return job_worknode;
    }

    public void setJob_worknode(String job_worknode) {
        this.job_worknode = job_worknode;
    }

    public String getJob_json() {
        return job_json;
    }

    public void setJob_json(String job_json) {
        this.job_json = job_json;
    }

    public int getBill_num() {
        return bill_num;
    }

    public void setBill_num(int bill_num) {
        this.bill_num = bill_num;
    }

    public String getBranchno() {
        return branchno;
    }

    public void setBranchno(String branchno) {
        this.branchno = branchno;
    }

    public String getTranno() {
        return tranno;
    }

    public void setTranno(String tranno) {
        this.tranno = tranno;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getExt4() {
        return ext4;
    }

    public void setExt4(String ext4) {
        this.ext4 = ext4;
    }

    public String getExt5() {
        return ext5;
    }

    public void setExt5(String ext5) {
        this.ext5 = ext5;
    }

    public Job_check(String job_status, String job_create, String job_start, String job_end, String job_detail, String job_worknode, String job_json, int bill_num, String branchno, String tranno) {
        this.job_status = job_status;
        this.job_create = job_create;
        this.job_start = job_start;
        this.job_end = job_end;
        this.job_detail = job_detail;
        this.job_worknode = job_worknode;
        this.job_json = job_json;
        this.bill_num = bill_num;
        this.branchno = branchno;
        this.tranno = tranno;
    }

    public Job_check(String job_status, String job_create, String job_detail, String job_worknode, String job_json, int bill_num, String branchno) {
        this.job_status = job_status;
        this.job_create = job_create;
        this.job_detail = job_detail;
        this.job_worknode = job_worknode;
        this.job_json = job_json;
        this.bill_num = bill_num;
        this.branchno = branchno;
    }

    public Job_check() {}
}
