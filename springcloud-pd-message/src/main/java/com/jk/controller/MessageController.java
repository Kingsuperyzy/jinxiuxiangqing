package com.jk.controller;

import com.jk.model.AttentionBean;
import com.jk.model.UserBean;
import com.jk.service.MessageSService;
import com.jk.zkx.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController implements MessageService {
    @Autowired
    private MessageSService messageService;

    @Override
    public List<UserBean> queryguanzhu() {
        return messageService.queryguanzhu();
    }

    @Override
    public List<UserBean> querywoguanzhuderen(int userid) {
        return messageService.querywoguanzhuderen(userid);
    }

    @Override
    public List<UserBean> queryguanzhuwoderen(int userid) {
        return messageService.queryguanzhuwoderen(userid);
    }

    @Override
    public List<UserBean> querylookme(int userid) {
        return messageService.querylookme(userid);
    }

    @Override
    public List<UserBean> querymelook(int userid) {
        return messageService.querymelook(userid);
    }

    @Override
    public void guanzhu(int userid, Integer id) {
        messageService.guanzhu(userid,id);
    }


}
