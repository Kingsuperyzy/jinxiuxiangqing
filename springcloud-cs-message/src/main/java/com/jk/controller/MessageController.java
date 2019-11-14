package com.jk.controller;

import com.jk.zkx.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
