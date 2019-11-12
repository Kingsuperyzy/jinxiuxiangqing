package com.jk.mapper;

import com.jk.model.HobbyBean;

public interface HobbyBeanMapper {
    int deleteByPrimaryKey(Integer hobbyid);

    int insert(HobbyBean record);

    int insertSelective(HobbyBean record);

    HobbyBean selectByPrimaryKey(Integer hobbyid);

    int updateByPrimaryKeySelective(HobbyBean record);

    int updateByPrimaryKey(HobbyBean record);
}