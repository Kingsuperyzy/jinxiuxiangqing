package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //开启zuul可用
public class SpringcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
    }

}
