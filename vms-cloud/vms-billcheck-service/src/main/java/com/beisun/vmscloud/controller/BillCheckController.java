package com.beisun.vmscloud.controller;

import com.beisun.vmscloud.entity.Inputparam;
import com.beisun.vmscloud.entity.Outputparam;
import com.beisun.vmscloud.service.IBillCheckService;
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
@Api(value = "BillCheckController",description = "单证核销(E门店)",produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/vms-cloud")
public class BillCheckController {
    Logger log = LoggerFactory.getLogger(BillCheckController.class);


    @Autowired
    IBillCheckService billCheckService;

    @ApiOperation(value = "单证核销(E门店)" ,notes = "保存(E门店)待核销数据包")
    @ApiImplicitParam(name = "inputparam",value = "请求数据(json)",required = true,dataType = "Inputparam")
    @RequestMapping(value = "/BillCheckService",method = RequestMethod.POST)
    public Outputparam billCheckService(@RequestBody Inputparam inputparam){
        Outputparam outputparam = billCheckService.createJob(inputparam);
        log.info(outputparam.toString());
        return outputparam;
    }
}
