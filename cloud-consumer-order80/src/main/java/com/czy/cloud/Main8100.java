package com.czy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动配置
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Main8100 {
    public static void main(String[] args) {
        SpringApplication.run(Main8100.class,args);
    }
}
