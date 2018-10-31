package com.beisun.vmscloud.service.impl;

import com.beisun.vmscloud.service.IBillCheckService;
import org.springframework.stereotype.Service;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-10-30 15:54
 * @description 根据机构切换service实现
 **/

public class SwitchServiceImpl {
    public IBillCheckService service110000; // 北京分公司
    public IBillCheckService service120000; // 天津分公司
    public IBillCheckService service130000; // 河北分公司
    public IBillCheckService service140000; // 山西分公司
    public IBillCheckService service150000; // 内蒙古分公司
    public IBillCheckService service210000; // 辽宁分公司
    public IBillCheckService service210200; // 大连分公司
    public IBillCheckService service220000; // 吉林分公司
    public IBillCheckService service230000; // 黑龙江分公司
    public IBillCheckService service310000; // 上海分公司
    public IBillCheckService service320000; // 江苏分公司
    public IBillCheckService service330000; // 浙江分公司
    public IBillCheckService service330200; // 宁波分公司
    public IBillCheckService service340000; // 安徽分公司
    public IBillCheckService service350000; // 福建分公司
    public IBillCheckService service350200; // 厦门分公司
    public IBillCheckService service360000; // 江西分公司
    public IBillCheckService service370000; // 山东分公司
    public IBillCheckService service370200; // 青岛分公司
    public IBillCheckService service410000; // 河南分公司
    public IBillCheckService service420000; // 湖北分公司
    public IBillCheckService service430000; // 湖南分公司
    public IBillCheckService service440000; // 广东分公司
    public IBillCheckService service440200; // 深圳分公司
    public IBillCheckService service450000; // 广西分公司
    public IBillCheckService service460000; // 海南分公司
    public IBillCheckService service510000; // 四川分公司
    public IBillCheckService service520000; // 贵州分公司
    public IBillCheckService service530000; // 云南分公司
    public IBillCheckService service610000; // 陕西分公司
    public IBillCheckService service620000; // 甘肃分公司
    public IBillCheckService service630000; // 青海分公司
    public IBillCheckService service640000; // 宁厦分公司
    public IBillCheckService service650000; // 新疆分公司
    public IBillCheckService service660000; // 重庆分公司
    public IBillCheckService service850000; // 西藏分公司
    
    public IBillCheckService switchServiceByBranch(String branch_no){
        switch (branch_no){
            // 北京分公司
            case "110000" :
                return service110000;
            // 天津分公司
            case "120000" :
                return service120000;
            // 河北分公司
            case "130000":
                return service130000;
            // 山西分公司
            case "140000":
                return service140000;
            // 内蒙古分公司
            case "150000":
                return service150000;
            // 辽宁分公司
            case "210000":
                return service210000;
            // 大连分公司
            case "210200":
                return service210200;
            // 吉林分公司
            case "220000":
                return service220000;
            // 黑龙江分公司
            case "230000":
                return service230000;
            // 上海分公司
            case "310000":
                return service310000;
            // 江苏分公司
            case "320000":
                return service320000;
            // 浙江分公司
            case "330000":
                return service330000;
            // 宁波分公司
            case "330200":
                return service330200;
            // 安徽分公司
            case "340000":
                return service340000;
            // 福建分公司
            case "350000":
                return service350000;
            // 厦门分公司
            case "350200":
                return service350200;
            // 江西分公司
            case "360000":
                return service360000;
            // 山东分公司
            case "370000":
                return service370000;
            // 青岛分公司
            case "370200":
                return service370200;
            // 河南分公司
            case "410000":
                return service410000;
            // 湖北分公司
            case "420000":
                return service420000;
            // 湖南分公司
            case "430000":
                return service430000;
            // 广东分公司
            case "440000":
                return service440000;
            // 深圳分公司
            case "440200":
                return service440200;
            // 广西分公司
            case "450000":
                return service450000;
            // 海南分公司
            case "460000":
                return service460000;
            // 四川分公司
            case "510000":
                return service510000;
            // 贵州分公司
            case "520000":
                return service520000;
            // 云南分公司
            case "530000":
                return service530000;
            // 陕西分公司
            case "610000":
                return service610000;
            // 甘肃分公司
            case "620000":
                return service620000;
            // 青海分公司
            case "630000":
                return service630000;
            // 宁厦分公司
            case "640000":
                return service640000;
            // 新疆分公司
            case "650000":
                return service650000;
            // 重庆分公司
            case "660000":
                return service660000;
            // 西藏分公司
            case "850000":
                return service850000;
            default :
                return  null;
        }
    }

    public IBillCheckService getService110000() {
        return service110000;
    }

    public void setService110000(IBillCheckService service110000) {
        this.service110000 = service110000;
    }

    public IBillCheckService getService120000() {
        return service120000;
    }

    public void setService120000(IBillCheckService service120000) {
        this.service120000 = service120000;
    }

    public IBillCheckService getService130000() {
        return service130000;
    }

    public void setService130000(IBillCheckService service130000) {
        this.service130000 = service130000;
    }

    public IBillCheckService getService140000() {
        return service140000;
    }

    public void setService140000(IBillCheckService service140000) {
        this.service140000 = service140000;
    }

    public IBillCheckService getService150000() {
        return service150000;
    }

    public void setService150000(IBillCheckService service150000) {
        this.service150000 = service150000;
    }

    public IBillCheckService getService210000() {
        return service210000;
    }

    public void setService210000(IBillCheckService service210000) {
        this.service210000 = service210000;
    }

    public IBillCheckService getService210200() {
        return service210200;
    }

    public void setService210200(IBillCheckService service210200) {
        this.service210200 = service210200;
    }

    public IBillCheckService getService220000() {
        return service220000;
    }

    public void setService220000(IBillCheckService service220000) {
        this.service220000 = service220000;
    }

    public IBillCheckService getService230000() {
        return service230000;
    }

    public void setService230000(IBillCheckService service230000) {
        this.service230000 = service230000;
    }

    public IBillCheckService getService310000() {
        return service310000;
    }

    public void setService310000(IBillCheckService service310000) {
        this.service310000 = service310000;
    }

    public IBillCheckService getService320000() {
        return service320000;
    }

    public void setService320000(IBillCheckService service320000) {
        this.service320000 = service320000;
    }

    public IBillCheckService getService330000() {
        return service330000;
    }

    public void setService330000(IBillCheckService service330000) {
        this.service330000 = service330000;
    }

    public IBillCheckService getService330200() {
        return service330200;
    }

    public void setService330200(IBillCheckService service330200) {
        this.service330200 = service330200;
    }

    public IBillCheckService getService340000() {
        return service340000;
    }

    public void setService340000(IBillCheckService service340000) {
        this.service340000 = service340000;
    }

    public IBillCheckService getService350000() {
        return service350000;
    }

    public void setService350000(IBillCheckService service350000) {
        this.service350000 = service350000;
    }

    public IBillCheckService getService350200() {
        return service350200;
    }

    public void setService350200(IBillCheckService service350200) {
        this.service350200 = service350200;
    }

    public IBillCheckService getService360000() {
        return service360000;
    }

    public void setService360000(IBillCheckService service360000) {
        this.service360000 = service360000;
    }

    public IBillCheckService getService370000() {
        return service370000;
    }

    public void setService370000(IBillCheckService service370000) {
        this.service370000 = service370000;
    }

    public IBillCheckService getService370200() {
        return service370200;
    }

    public void setService370200(IBillCheckService service370200) {
        this.service370200 = service370200;
    }

    public IBillCheckService getService410000() {
        return service410000;
    }

    public void setService410000(IBillCheckService service410000) {
        this.service410000 = service410000;
    }

    public IBillCheckService getService420000() {
        return service420000;
    }

    public void setService420000(IBillCheckService service420000) {
        this.service420000 = service420000;
    }

    public IBillCheckService getService430000() {
        return service430000;
    }

    public void setService430000(IBillCheckService service430000) {
        this.service430000 = service430000;
    }

    public IBillCheckService getService440000() {
        return service440000;
    }

    public void setService440000(IBillCheckService service440000) {
        this.service440000 = service440000;
    }

    public IBillCheckService getService440200() {
        return service440200;
    }

    public void setService440200(IBillCheckService service440200) {
        this.service440200 = service440200;
    }

    public IBillCheckService getService450000() {
        return service450000;
    }

    public void setService450000(IBillCheckService service450000) {
        this.service450000 = service450000;
    }

    public IBillCheckService getService460000() {
        return service460000;
    }

    public void setService460000(IBillCheckService service460000) {
        this.service460000 = service460000;
    }

    public IBillCheckService getService510000() {
        return service510000;
    }

    public void setService510000(IBillCheckService service510000) {
        this.service510000 = service510000;
    }

    public IBillCheckService getService520000() {
        return service520000;
    }

    public void setService520000(IBillCheckService service520000) {
        this.service520000 = service520000;
    }

    public IBillCheckService getService530000() {
        return service530000;
    }

    public void setService530000(IBillCheckService service530000) {
        this.service530000 = service530000;
    }

    public IBillCheckService getService610000() {
        return service610000;
    }

    public void setService610000(IBillCheckService service610000) {
        this.service610000 = service610000;
    }

    public IBillCheckService getService620000() {
        return service620000;
    }

    public void setService620000(IBillCheckService service620000) {
        this.service620000 = service620000;
    }

    public IBillCheckService getService630000() {
        return service630000;
    }

    public void setService630000(IBillCheckService service630000) {
        this.service630000 = service630000;
    }

    public IBillCheckService getService640000() {
        return service640000;
    }

    public void setService640000(IBillCheckService service640000) {
        this.service640000 = service640000;
    }

    public IBillCheckService getService650000() {
        return service650000;
    }

    public void setService650000(IBillCheckService service650000) {
        this.service650000 = service650000;
    }

    public IBillCheckService getService660000() {
        return service660000;
    }

    public void setService660000(IBillCheckService service660000) {
        this.service660000 = service660000;
    }

    public IBillCheckService getService850000() {
        return service850000;
    }

    public void setService850000(IBillCheckService service850000) {
        this.service850000 = service850000;
    }
}
