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

    @Override
    public void updateDetailUser(DetailsBean detailsBean) {
        ysMapper.updateDetailUser(detailsBean);
    }

    @Override
    public HobbyBean findHobbyById(Integer userId) {
        return ysMapper.findHobbyById(userId);
    }

    @Override
    public void updateHobby(HobbyBean hobbyBean) {
        ysMapper.updateHobby(hobbyBean);
    }

    @Override
    public LifeBean findWorkById(Integer userId) {
        return ysMapper.findWorkById(userId);
    }

    @Override
    public List<HousingSituationBean> queryhousingsituationid() {
        return ysMapper.queryhousingsituationid();
    }

    @Override
    public List<CarSituationBean> querycarsituationid() {
        return ysMapper.querycarsituationid();
    }

    @Override
    public List<SmokeBean> querysmokeid() {
        return ysMapper.querysmokeid();
    }

    @Override
    public List<DrinkBean> querydrinkid() {
        return ysMapper.querydrinkid();
    }

    @Override
    public void updateWorkUser(LifeBean lifeBean) {
        ysMapper.updateWorkUser(lifeBean);
    }
}
