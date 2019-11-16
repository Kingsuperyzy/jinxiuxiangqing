package com.jk.service.impl;

import com.jk.mapper.MessageDao;
import com.jk.model.AttentionBean;
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

    @Override
    public List<UserBean> querywoguanzhuderen(int userid) {
        return messageDao.querywoguanzhuderen(userid);
    }

    @Override
    public List<UserBean> queryguanzhuwoderen(int userid) {
        return messageDao.queryguanzhuwoderen(userid);
    }

    @Override
    public List<UserBean> querylookme(int userid) {
        return messageDao.querylookme(userid);
    }

    @Override
    public List<UserBean> querymelook(int userid) {
        return messageDao.querymelook(userid);
    }

    @Override
    public void guanzhu(int userid, Integer id) {
        messageDao.guanzhu(userid,id);
    }


}
