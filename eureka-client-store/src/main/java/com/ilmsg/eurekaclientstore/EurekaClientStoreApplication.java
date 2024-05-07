package com.ilmsg.eurekaclientstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientStoreApplication.class, args);
    }

}