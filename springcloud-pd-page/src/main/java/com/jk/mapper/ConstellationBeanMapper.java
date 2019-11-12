package com.jk.mapper;

import com.jk.model.ConstellationBean;

public interface ConstellationBeanMapper {
    int deleteByPrimaryKey(Integer constellationid);

    int insert(ConstellationBean record);

    int insertSelective(ConstellationBean record);

    ConstellationBean selectByPrimaryKey(Integer constellationid);

    int updateByPrimaryKeySelective(ConstellationBean record);

    int updateByPrimaryKey(ConstellationBean record);
}