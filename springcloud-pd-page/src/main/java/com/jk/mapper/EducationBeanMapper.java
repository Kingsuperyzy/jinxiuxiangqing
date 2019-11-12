package com.jk.mapper;

import com.jk.model.EducationBean;

public interface EducationBeanMapper {
    int deleteByPrimaryKey(Integer educationid);

    int insert(EducationBean record);

    int insertSelective(EducationBean record);

    EducationBean selectByPrimaryKey(Integer educationid);

    int updateByPrimaryKeySelective(EducationBean record);

    int updateByPrimaryKey(EducationBean record);
}