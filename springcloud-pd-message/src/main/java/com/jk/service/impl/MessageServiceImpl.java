package com.jk.service.impl;

import com.jk.mapper.MessageDao;
import com.jk.model.UserBean;
import com.jk.service.MessageSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageSService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public List<UserBean> queryguanzhu() {
        return messageDao.queryguanzhu();
    }
}
