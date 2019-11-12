package com.jk.mapper;

import com.jk.model.SmokeBean;

public interface SmokeBeanMapper {
    int deleteByPrimaryKey(Integer smokeid);

    int insert(SmokeBean record);

    int insertSelective(SmokeBean record);

    SmokeBean selectByPrimaryKey(Integer smokeid);

    int updateByPrimaryKeySelective(SmokeBean record);

    int updateByPrimaryKey(SmokeBean record);
}