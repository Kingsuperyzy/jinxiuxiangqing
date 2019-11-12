package com.jk.mapper;

import com.jk.model.HousingSituationBean;

public interface HousingSituationBeanMapper {
    int deleteByPrimaryKey(Integer housingsituationid);

    int insert(HousingSituationBean record);

    int insertSelective(HousingSituationBean record);

    HousingSituationBean selectByPrimaryKey(Integer housingsituationid);

    int updateByPrimaryKeySelective(HousingSituationBean record);

    int updateByPrimaryKey(HousingSituationBean record);
}