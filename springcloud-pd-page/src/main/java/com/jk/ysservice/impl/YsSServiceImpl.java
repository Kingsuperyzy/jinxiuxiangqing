package com.jk.ysservice.impl;

import com.jk.model.*;
import com.jk.ysmapper.YsMapper;
import com.jk.ysservice.YsSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YsSServiceImpl implements YsSService {

    @Autowired
    private YsMapper ysMapper;
    @Override
    public String user() {

        return "111";
    }

    @Override
    public UserBean findUserById(Integer userId) {
        return ysMapper.findUserById(userId);
    }

    @Override
    public void updateUser(UserBean userBean) {
        ysMapper.updateUser(userBean);
    }

    @Override
    public List<ShapeBean> queryshapeid() {
        return ysMapper.queryshapeid();
    }

    @Override
    public DetailsBean findDetailById(Integer userId) {
        return ysMapper.findDetailById(userId);
    }

    @Override
    public List<ConstellationBean> queryconstellationid() {
        return ysMapper.queryconstellationid();
    }

    @Override
    public List<NationBean> querynationid() {
        return ysMapper.querynationid();
    }

    @Override
    public List<ChildrenBean> querychildrenid() {
        return ysMapper.querychildrenid();
    }

    @Override
    public List<MarriedBean> querymarriedid() {
        return ysMapper.querymarriedid();
    }
}
