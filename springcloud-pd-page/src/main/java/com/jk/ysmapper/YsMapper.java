package com.jk.ysmapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface YsMapper {
    @Select("select * from t_user where userId=#{userId}")
    UserBean findUserById(Integer userId);

    @Update("update t_user set userName=#{username},userPhone=#{userphone},sex=#{sex},monthlyIncome=#{monthlyincome},innerMonologue=#{innermonologue}  where userId=#{userid}")
    void updateUser(UserBean userBean);

    @Select("select ts.shapeId,ts.shapeName from t_shape ts")
    List<ShapeBean> queryshapeid();

    @Select("select * from t_details where userId=#{userId}")
    DetailsBean findDetailById(Integer userId);

    @Select("select tc.constellationId,tc.constellationName FROM t_constellation tc")
    List<ConstellationBean> queryconstellationid();


    @Select("select  tn.nationId,tn.nationName FROM t_nation tn")
    List<NationBean> querynationid();

    @Select("select  tc.childrenId,tc.childrenName FROM t_children  tc")
    List<ChildrenBean> querychildrenid();

    @Select("select  tm.marriedId,tm.marriedName FROM t_married tm")
    List<MarriedBean> querymarriedid();
}
