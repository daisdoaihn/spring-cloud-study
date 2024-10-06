package com.czy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //注册到consul
public class Main9527 {
    public static void main(String[] args) {
            SpringApplication.run(Main9527.class,args);
    }
}