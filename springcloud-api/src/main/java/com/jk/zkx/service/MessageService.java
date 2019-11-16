package com.jk.zkx.service;

import com.jk.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "pd-message")
public interface MessageService {
    @GetMapping("queryguanzhu")
    List<UserBean> queryguanzhu();
}
