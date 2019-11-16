package com.jk.service;

import com.jk.model.AttentionBean;
import com.jk.model.UserBean;

import java.util.List;

public interface MessageSService {
    List<UserBean> queryguanzhu();

    List<UserBean> querywoguanzhuderen(int userid);

    List<UserBean> queryguanzhuwoderen(int userid);

    List<UserBean> querylookme(int userid);

    List<UserBean> querymelook(int userid);

    void guanzhu(int userid, Integer id);
}
