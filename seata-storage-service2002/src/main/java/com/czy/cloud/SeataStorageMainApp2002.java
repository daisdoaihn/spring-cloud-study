package com.czy.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.czy.cloud.mapper")
@EnableFeignClients
@EnableDiscoveryClient
public class SeataStorageMainApp2002 {
    public static void main(String[] args) {
            SpringApplication.run(SeataStorageMainApp2002.class,args);
        }
}
