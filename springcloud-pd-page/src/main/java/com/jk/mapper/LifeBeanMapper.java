package com.jk.mapper;

import com.jk.model.LifeBean;

public interface LifeBeanMapper {
    int deleteByPrimaryKey(Integer lifeid);

    int insert(LifeBean record);

    int insertSelective(LifeBean record);

    LifeBean selectByPrimaryKey(Integer lifeid);

    int updateByPrimaryKeySelective(LifeBean record);

    int updateByPrimaryKey(LifeBean record);
}