package com.beisun.vmscloud.controller;

import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Outputparam;
import com.beisun.vmscloud.service.IBillCheckService;
import com.beisun.vmscloud.service.impl.SwitchServiceImpl;
import com.beisun.vmscloud.util.BranchUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-21 16:10
 * @description web
 **/
@RestController
@Api(value = "BillCheckController",description = "单证核销(激活卡)",produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/vms-cloud")
public class BillCheckController {
    Logger log = LoggerFactory.getLogger(BillCheckController.class);


    @Autowired
    SwitchServiceImpl switchServiceImpl;

    @ApiOperation(value = "单证核销(激活卡)" ,notes = "保存(激活卡)待核销数据包")
    @ApiImplicitParam(name = "inputparam",value = "请求数据(json)",required = true,dataType = "Inputparam")
    @RequestMapping(value = "/BillCheckService",method = RequestMethod.POST)
    public Outputparam billCheckService(@RequestBody Inputparam inputparam){
        Outputparam outputparam = null ;
        String mngBranchNo = null;
        try {
            //获取省级机构号
            mngBranchNo = BranchUtil.getMngBranch(inputparam.getBranchno());
            IBillCheckService billCheckService = switchServiceImpl.switchServiceByBranch(mngBranchNo);
            outputparam  = billCheckService.createJob(inputparam);
        }catch (Exception e){
            String errorMessage = "[未找到"+mngBranchNo+"对应数据源配置，接口调用失败]";
            log.error(errorMessage+e.getMessage());
            outputparam = new Outputparam("1001",errorMessage,"");
        }
        return outputparam;
    }
}
