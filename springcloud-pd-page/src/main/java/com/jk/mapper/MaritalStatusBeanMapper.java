package com.jk.mapper;

import com.jk.model.MaritalStatusBean;

public interface MaritalStatusBeanMapper {
    int deleteByPrimaryKey(Integer maritalstatusid);

    int insert(MaritalStatusBean record);

    int insertSelective(MaritalStatusBean record);

    MaritalStatusBean selectByPrimaryKey(Integer maritalstatusid);

    int updateByPrimaryKeySelective(MaritalStatusBean record);

    int updateByPrimaryKey(MaritalStatusBean record);
}