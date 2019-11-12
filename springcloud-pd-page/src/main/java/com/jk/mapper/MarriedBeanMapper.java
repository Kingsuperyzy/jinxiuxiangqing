package com.jk.mapper;

import com.jk.model.MarriedBean;

public interface MarriedBeanMapper {
    int deleteByPrimaryKey(Integer marriedid);

    int insert(MarriedBean record);

    int insertSelective(MarriedBean record);

    MarriedBean selectByPrimaryKey(Integer marriedid);

    int updateByPrimaryKeySelective(MarriedBean record);

    int updateByPrimaryKey(MarriedBean record);
}