package com.jk.mapper;

import com.jk.model.DetailsBean;

public interface DetailsBeanMapper {
    int deleteByPrimaryKey(Integer detailsid);

    int insert(DetailsBean record);

    int insertSelective(DetailsBean record);

    DetailsBean selectByPrimaryKey(Integer detailsid);

    int updateByPrimaryKeySelective(DetailsBean record);

    int updateByPrimaryKey(DetailsBean record);
}