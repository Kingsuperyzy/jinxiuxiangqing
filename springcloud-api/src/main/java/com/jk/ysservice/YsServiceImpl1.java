package com.jk.ysservice;

import com.jk.model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class YsServiceImpl1 implements YsService {
    @Override
    public String user() {
        return null;
    }

    @Override
    public UserBean findUserById(Integer userId) {
        return null;
    }

    @Override
    public void updateUser(UserBean userBean) {

    }

    @Override
    public List<ShapeBean> queryshapeid() {
        return null;
    }

    @Override
    public DetailsBean findDetailById(Integer userId) {
        return null;
    }

    @Override
    public List<ConstellationBean> queryconstellationid() {
        return null;
    }

    @Override
    public List<NationBean> querynationid() {
        return null;
    }

    @Override
    public List<ChildrenBean> querychildrenid() {
        return null;
    }

    @Override
    public List<MarriedBean> querymarriedid() {
        return null;
    }
}
