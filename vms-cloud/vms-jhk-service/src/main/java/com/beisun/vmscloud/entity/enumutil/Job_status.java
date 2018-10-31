package com.beisun.vmscloud.entity.enumutil;
/**
 * @description 枚举类-任务状态
 * @author  Carol Tang
 * @date  2018/9/26
 **/
public enum Job_status {
    JOB_START(2),//待处理
    JOB_PROCESS(3),//处理中
    JOB_FINISH(1),//处理完成
    JOB_ERROR(0);//失败

    public int val;
    private Job_status(int val){
        this.val = val;
    }

    @Override
    public String toString(){
        return ""+val;
    }

    public static void main(String[] args){
        System.out.println(Job_status.JOB_ERROR);
    }
}