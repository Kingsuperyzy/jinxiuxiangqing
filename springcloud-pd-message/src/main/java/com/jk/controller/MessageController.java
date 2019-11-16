package com.jk.controller;

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
}
