package com.jk.zhhMapper;

import com.jk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：
 * 类名称：userController
 * 类描述：
 * 创建人：zhang hao hao
 *
 * 励志语录: 业精于勤荒于嬉 行成于思毁于随
 *
 * 创建时间：2019/11/12
 * 修改人：zhang hao hao  2086715372@qq.com
 * 修改时间：2019/11/12
 * 修改备注：
 * @version </pre>
 */
@Mapper
@Repository
public interface zhhMapper {

    @Select("select id,text,pid,url as path from  t_tree  where pid = #{value}")
    List<TreeBean> findTree(Integer id);



    /**
     * 查询是否喝酒下拉
     * @return
     */
    @Select("select td.drinkId , td.drinkName from  t_drink  td")
    List<DrinkBean> findDrink();

    /**
     * 查询是否吸烟下拉
     * @return
     */
  @Select("select  ts.smokeId , ts.smokeName from  t_smoke  ts")
    List<SmokeBean> findSmoke();

    /**
     * 查询孩子
     * @return
     */
    @Select("select  tc.childrenId , tc.childrenName from  t_children   tc ")
    List<ChildrenBean> findChildren();

    /**
     * 查询婚姻表
     * @return
     */
    @Select("select   tms.maritalStatusId , tms.maritalStatusName from t_maritalstatus  tms")
    List<MaritalStatusBean> findMaritalStatus();


    /**
     * 查看学历表
     * @return
     */
    @Select("select  te.educationId, te.educationName from t_education  te")
    List<EducationBean> findEducation();

    /**
     *  择偶表保存
     * @param partnerBean
     */
    void savePartner(PartnerBean partnerBean);

    /**
     * 择偶表回显
     * @param userId
     * @return
     */
    @Select("select   * from  t_partner tp where  tp.partnerId = #{userId}")
    PartnerBean findPartnerById(Integer userId);
}
