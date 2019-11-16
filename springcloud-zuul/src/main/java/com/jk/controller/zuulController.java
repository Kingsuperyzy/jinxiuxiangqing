package com.jk.controller;
/**
 * @program: jinxiuxiangqing
 * @author: yzy
 * @create: 2019-11-14 20:33
 **/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *@ClassName zuulController
 *@Author yzy
 *@Date 2019/11/14 20:33
 */
@Controller
@RequestMapping("page")
public class zuulController {


        @RequestMapping("login")
        public String toLogin(){

            System.out.println("1233522");
            return "login.html";
        }
}
