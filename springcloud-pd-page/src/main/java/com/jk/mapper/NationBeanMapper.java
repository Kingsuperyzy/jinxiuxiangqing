package com.jk.mapper;

import com.jk.model.NationBean;

public interface NationBeanMapper {
    int deleteByPrimaryKey(Integer nationid);

    int insert(NationBean record);

    int insertSelective(NationBean record);

    NationBean selectByPrimaryKey(Integer nationid);

    int updateByPrimaryKeySelective(NationBean record);

    int updateByPrimaryKey(NationBean record);
}