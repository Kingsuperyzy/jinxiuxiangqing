package com.jk.zkx.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "eureka-server")
public interface MessageService {
}
