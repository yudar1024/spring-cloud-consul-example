package com.roger.spring.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by chenluojie on 2016/8/2.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClient1 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClient1.class, args);
    }
}
