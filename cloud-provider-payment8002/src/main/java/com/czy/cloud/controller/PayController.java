package com.czy.cloud.controller;

import com.czy.cloud.entities.Pay;
import com.czy.cloud.resp.ResultData;
import com.czy.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="支付微服务夹",description="支付cRUD")
@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @Operation(summary ="新增",description ="新增支付流水方法,json串做参数")
    @PostMapping("add")
    public ResultData addPay(@RequestBody Pay pay){
        int i = payService.add(pay);
        return ResultData.success(i);
    }

    @DeleteMapping("delete/{payId}")
    @Operation(summary ="删除",description ="删除支付流水方法")
    public ResultData deletePay(@PathVariable("payId") Integer payId){
        int delete = payService.delete(payId);
        return ResultData.success(delete);
    }

    @PutMapping("update")
    @Operation(summary ="修改",description ="修改支付流水方法")
    public ResultData updatePay(@RequestBody Pay pay){
        int i = payService.update(pay);
        return ResultData.success(i);
    }

    @GetMapping("select/{payId}")
    public ResultData selById(@PathVariable("payId") Integer payId){
        if (payId < 0) throw new RuntimeException("id不能为负数");
        Pay pay = payService.getById(payId);
        return ResultData.success(pay);
    }

    @GetMapping("getALL")
    public ResultData list(){
        List<Pay> payList = payService.getAll();
        return ResultData.success(payList);
    }

//    @Value("${server.port}")
//    private String port;
//
//    @GetMapping(value = "/pay/select/info")
//    public String getInfoByConsul(@Value("${czy.info}") String czyInfo) {
//        return "czyInfo:" + czyInfo + "  " + "port:" + port;
//    }

}
