package com.beisun.vmscloud.util;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-31 16:28
 * @description 机构相关工具类
 **/
public class BranchUtil {

    /**
     * 获取省级机构号
     * @param deptId
     * @return
     * @throws Exception
     */
    public static String getMngBranch(String deptId) throws Exception {
        String mngBranch=deptId;
        String mngBranch4 = mngBranch.substring(0, 4);
        //如果是计划单列市
        if("3702".equals(mngBranch4) || "3302".equals(mngBranch4) || "4402".equals(mngBranch4)
                || "3502".equals(mngBranch4) || "2102".equals(mngBranch4)){
            mngBranch = mngBranch4.concat("00");
        } else {
            //如果是其他地市级机构
            String mngBranch2 = mngBranch.substring(0, 2);
            mngBranch = mngBranch2.concat("0000");
        }
        return mngBranch;
    }
}
