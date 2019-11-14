package com.jk.yscontroller;

import com.jk.model.*;
import com.jk.ysservice.YsSService;
import com.jk.ysservice.YsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class YsController implements YsService {

    @Autowired
    private YsSService ysSService;

    @Override
    public String user() {
        return ysSService.user();
    }

    @Override
    public UserBean findUserById(Integer userId) {
        return ysSService.findUserById(userId);
    }

    @Override
    public void updateUser(UserBean userBean) {
        ysSService.updateUser(userBean);
    }

    @Override
    public List<ShapeBean> queryshapeid() {
        return ysSService.queryshapeid();
    }

    @Override
    public DetailsBean findDetailById(Integer userId) {
        return ysSService.findDetailById(userId);
    }

    @Override
    public List<ConstellationBean> queryconstellationid() {
        return ysSService.queryconstellationid();
    }

    @Override
    public List<NationBean> querynationid() {
        return ysSService.querynationid();
    }

    @Override
    public List<ChildrenBean> querychildrenid() {
        return ysSService.querychildrenid();
    }

    @Override
    public List<MarriedBean> querymarriedid() {
        return ysSService.querymarriedid();
    }

    @Override
    public void updateDetailUser(DetailsBean detailsBean) {
        ysSService.updateDetailUser(detailsBean);
    }

    @Override
    public HobbyBean findHobbyById(Integer userId) {
        return ysSService.findHobbyById(userId);
    }

    @Override
    public void updateHobby(HobbyBean hobbyBean) {
        ysSService.updateHobby(hobbyBean);
    }

    @Override
    public LifeBean findWorkById(Integer userId) {
        return ysSService.findWorkById(userId);
    }

    @Override
    public List<HousingSituationBean> queryhousingsituationid() {
        return ysSService.queryhousingsituationid();
    }

    @Override
    public List<CarSituationBean> querycarsituationid() {
        return ysSService.querycarsituationid();
    }

    @Override
    public List<SmokeBean> querysmokeid() {
        return ysSService.querysmokeid();
    }

    @Override
    public List<DrinkBean> querydrinkid() {
        return ysSService.querydrinkid();
    }

    @Override
    public void updateWorkUser(LifeBean lifeBean) {
        ysSService.updateWorkUser(lifeBean);
    }
}
