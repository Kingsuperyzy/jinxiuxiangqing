package com.jk.controller;

import com.jk.model.AttentionBean;
import com.jk.model.UserBean;
import com.jk.zkx.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("toMessage")
    public String toMessage(){
        return "message";
    }
    @RequestMapping("toMessagelook")
    public String toMessagelook(){
        return "messagelook";
    }
    @RequestMapping("toMessageIlooky")
    public String toMessageIlooky(){
        return "messageIlooky";
    }
    @RequestMapping("toMessagexiaoxi")
    public String toMessagexiaoxi(){
        return "messagexiaoxi";
    }
    @RequestMapping("toMessagehongniang")
    public String toMessagehongniang(){
        return "messagehongniang";
    }
    @RequestMapping("toMessagerexian")
    public String toMessagerexian(){
        return "messagerexian";
    }
    @RequestMapping("toMessagegzme")
    public String toMessagegzme(){
        return "messagegzme";
    }
    @RequestMapping("toMessagemegz")
    public String toMessagemegz(){
        return "messagemegz";
    }

    @RequestMapping("queryguanzhu")
    @ResponseBody
    public List<UserBean> queryguanzhu(){
        return messageService.queryguanzhu();
    }
//我关注的人
    @RequestMapping("querywoguanzhuderen")
    @ResponseBody
    public List<UserBean> querywoguanzhuderen(){
        int userid = 1;
        return messageService.querywoguanzhuderen(userid);
    }
//关注我的人
    @RequestMapping("queryguanzhuwoderen")
    @ResponseBody
    public List<UserBean> queryguanzhuwoderen(){
        int userid = 1;
        return messageService.queryguanzhuwoderen(userid);
    }

    //看过我的人
    @RequestMapping("querylookme")
    @ResponseBody
    public List<UserBean> querylookme(){
        int userid = 1;
        return messageService.querylookme(userid);
    }

    //我看过的人
    @RequestMapping("querymelook")
    @ResponseBody
    public List<UserBean> querymelook(){
        int userid = 1;
        return messageService.querymelook(userid);
    }
    //关注我的人
    @RequestMapping("guanzhu")
    @ResponseBody
    public void guanzhu(Integer id){
        int userid = 1;
        messageService.guanzhu(userid,id);
    }

}
