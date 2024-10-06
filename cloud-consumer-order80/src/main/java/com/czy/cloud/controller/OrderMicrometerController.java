package com.czy.cloud.controller;

import com.czy.cloud.feign.FeignPayment8001;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderMicrometerController
{
    @Resource
    private FeignPayment8001 feignPayment8001;

    @GetMapping(value = "/feign/micrometer/{id}")
    public String myMicrometer(@PathVariable("id") Integer id)
    {
        return feignPayment8001.myMicrometer(id);
    }
}