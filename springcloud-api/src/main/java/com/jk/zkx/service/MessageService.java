package com.jk.zkx.service;

import com.jk.model.AttentionBean;
import com.jk.model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "pd-message")
public interface MessageService {
    @GetMapping("queryguanzhu")
    List<UserBean> queryguanzhu();
    @GetMapping("querywoguanzhuderen")
    List<UserBean> querywoguanzhuderen(@RequestParam int userid);
    @GetMapping("queryguanzhuwoderen")
    List<UserBean> queryguanzhuwoderen(@RequestParam int userid);
    @GetMapping("querylookme")
    List<UserBean> querylookme(@RequestParam int userid);
    @GetMapping("querymelook")
    List<UserBean> querymelook(@RequestParam int userid);
    @PostMapping("guanzhu")
    void guanzhu(@RequestParam int userid,@RequestParam Integer id);
}
