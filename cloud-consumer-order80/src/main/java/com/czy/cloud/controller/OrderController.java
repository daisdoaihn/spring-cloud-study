package com.czy.cloud.controller;

import com.czy.cloud.entities.PayDTO;
import com.czy.cloud.resp.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class OrderController {

//    public static final String PaymentSrv_URL="http://localhost:8001";//先写死，硬编码
    public static final String PaymentSrv_URL="http://cloud-payment-service";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/pay/add")
    public ResultData addOrder(@RequestBody PayDTO payDTO){
        return restTemplate.postForObject(PaymentSrv_URL + "/pay/add", payDTO, ResultData.class);
    }

    @GetMapping("select/{payId}")
    public ResultData getOrderInfo(@PathVariable("payId") Integer payId){
        return restTemplate.getForObject(PaymentSrv_URL+"/pay/select/"+payId,ResultData.class,payId);
    }
}
