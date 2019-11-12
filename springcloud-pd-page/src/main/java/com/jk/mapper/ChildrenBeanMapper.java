package com.jk.mapper;

import com.jk.model.ChildrenBean;

public interface ChildrenBeanMapper {
    int deleteByPrimaryKey(Integer childrenid);

    int insert(ChildrenBean record);

    int insertSelective(ChildrenBean record);

    ChildrenBean selectByPrimaryKey(Integer childrenid);

    int updateByPrimaryKeySelective(ChildrenBean record);

    int updateByPrimaryKey(ChildrenBean record);
}