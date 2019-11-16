package com.jk.mapper;

import com.jk.model.AttentionBean;
import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MessageDao {
    @Select("select * from t_user")
    List<UserBean> queryguanzhu();
    @Select("SELECT * from t_user_attention tua LEFT JOIN t_user tu on tua.beAttentionId = tu.userId where tua.attentionUserId = #{userid}")
    List<UserBean> querywoguanzhuderen(int userid);
    @Select("SELECT * from t_user_attention tua LEFT JOIN t_user tu on tua.attentionUserId = tu.userId where tua.beAttentionId =  #{userid}")
    List<UserBean> queryguanzhuwoderen(int userid);
    @Select("SELECT * from t_user_look tul LEFT JOIN t_user tu on tul.userid = tu.userId where tul.actionid = #{userid}")
    List<UserBean> querylookme(int userid);
    @Select("SELECT * from t_user_look tul LEFT JOIN t_user tu on tul.actionid = tu.userId where tul.userid =  #{userid}")
    List<UserBean> querymelook(int userid);

    void guanzhu(@Param("userid") int userid,@Param("id") Integer id);
}
