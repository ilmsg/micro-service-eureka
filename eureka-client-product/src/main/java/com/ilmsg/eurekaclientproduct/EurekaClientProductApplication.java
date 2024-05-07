package com.ilmsg.eurekaclientproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProductApplication.class, args);
    }

}