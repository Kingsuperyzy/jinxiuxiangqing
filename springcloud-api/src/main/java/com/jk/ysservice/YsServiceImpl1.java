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

    @Override
    public void updateDetailUser(DetailsBean detailsBean) {

    }

    @Override
    public HobbyBean findHobbyById(Integer userId) {
        return null;
    }

    @Override
    public void updateHobby(HobbyBean hobbyBean) {

    }

    @Override
    public LifeBean findWorkById(Integer userId) {
        return null;
    }

    @Override
    public List<HousingSituationBean> queryhousingsituationid() {
        return null;
    }

    @Override
    public List<CarSituationBean> querycarsituationid() {
        return null;
    }

    @Override
    public List<SmokeBean> querysmokeid() {
        return null;
    }

    @Override
    public List<DrinkBean> querydrinkid() {
        return null;
    }

    @Override
    public void updateWorkUser(LifeBean lifeBean) {

    }
}
