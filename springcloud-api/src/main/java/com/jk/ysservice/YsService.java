package com.jk.ysservice;

import com.jk.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "pd-page",fallback = YsServiceImpl1.class)
public interface YsService {

    @GetMapping("user")
    String user();

    @GetMapping("findUserById")
    UserBean findUserById(@RequestParam Integer userId);

    @PostMapping("updateUser")
    void updateUser(@SpringQueryMap UserBean userBean);

    @GetMapping("queryshapeid")
    List<ShapeBean> queryshapeid();

    @GetMapping("findDetailById")
    DetailsBean findDetailById(@RequestParam Integer userId);

    @GetMapping("queryconstellationid")
    List<ConstellationBean> queryconstellationid();

    @GetMapping("querynationid")
    List<NationBean> querynationid();

    @GetMapping("querychildrenid")
    List<ChildrenBean> querychildrenid();

    @GetMapping("querymarriedid")
    List<MarriedBean> querymarriedid();
}
