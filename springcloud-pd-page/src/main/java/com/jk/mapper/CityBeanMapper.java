package com.jk.mapper;

import com.jk.model.CityBean;

public interface CityBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CityBean record);

    int insertSelective(CityBean record);

    CityBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CityBean record);

    int updateByPrimaryKey(CityBean record);
}