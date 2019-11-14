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

    void updateDetailUser(DetailsBean detailsBean);

    HobbyBean findHobbyById(Integer userId);

    void updateHobby(HobbyBean hobbyBean);

    LifeBean findWorkById(Integer userId);

    List<HousingSituationBean> queryhousingsituationid();

    List<CarSituationBean> querycarsituationid();

    List<SmokeBean> querysmokeid();

    List<DrinkBean> querydrinkid();

    void updateWorkUser(LifeBean lifeBean);
}
