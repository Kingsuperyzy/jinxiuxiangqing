package com.jk.mapper;

import com.jk.model.CarSituationBean;

public interface CarSituationBeanMapper {
    int deleteByPrimaryKey(Integer carsituationid);

    int insert(CarSituationBean record);

    int insertSelective(CarSituationBean record);

    CarSituationBean selectByPrimaryKey(Integer carsituationid);

    int updateByPrimaryKeySelective(CarSituationBean record);

    int updateByPrimaryKey(CarSituationBean record);
}