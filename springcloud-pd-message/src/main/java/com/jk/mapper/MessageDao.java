package com.jk.mapper;

import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MessageDao {
    @Select("select * from t_user")
    List<UserBean> queryguanzhu();
}
