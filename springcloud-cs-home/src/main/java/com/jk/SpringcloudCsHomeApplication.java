package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启feign可用
public class SpringcloudCsHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudCsHomeApplication.class, args);
    }

}
