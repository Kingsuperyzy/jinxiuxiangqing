package com.jk.mapper;

import com.jk.model.DrinkBean;

public interface DrinkBeanMapper {
    int deleteByPrimaryKey(Integer drinkid);

    int insert(DrinkBean record);

    int insertSelective(DrinkBean record);

    DrinkBean selectByPrimaryKey(Integer drinkid);

    int updateByPrimaryKeySelective(DrinkBean record);

    int updateByPrimaryKey(DrinkBean record);
}