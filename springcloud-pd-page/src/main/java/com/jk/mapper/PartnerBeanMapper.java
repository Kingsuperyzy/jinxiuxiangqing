package com.jk.mapper;

import com.jk.model.PartnerBean;

public interface PartnerBeanMapper {
    int deleteByPrimaryKey(Integer partnerid);

    int insert(PartnerBean record);

    int insertSelective(PartnerBean record);

    PartnerBean selectByPrimaryKey(Integer partnerid);

    int updateByPrimaryKeySelective(PartnerBean record);

    int updateByPrimaryKey(PartnerBean record);
}