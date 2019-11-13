package com.jk.ysservice;

import com.jk.model.*;

import java.util.List;

public interface YsSService {
    String user();

    UserBean findUserById(Integer userId);

    void updateUser(UserBean userBean);

    List<ShapeBean> queryshapeid();

    DetailsBean findDetailById(Integer userId);

    List<ConstellationBean> queryconstellationid();

    List<NationBean> querynationid();

    List<ChildrenBean> querychildrenid();

    List<MarriedBean> querymarriedid();
}
