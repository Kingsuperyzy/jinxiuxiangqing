package com.jk.mapper;

import com.jk.model.ShapeBean;

public interface ShapeBeanMapper {
    int deleteByPrimaryKey(Integer shapeid);

    int insert(ShapeBean record);

    int insertSelective(ShapeBean record);

    ShapeBean selectByPrimaryKey(Integer shapeid);

    int updateByPrimaryKeySelective(ShapeBean record);

    int updateByPrimaryKey(ShapeBean record);
}