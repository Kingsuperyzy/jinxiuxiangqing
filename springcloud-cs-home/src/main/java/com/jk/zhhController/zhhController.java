package com.jk.zhhController;

import com.jk.model.*;
import com.jk.zhhService.zhhServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping("zhh")
public class zhhController {

  @Autowired()
  private zhhServices zhhservice;


    /**
     * 查询左侧树
     * @return
     */
  @RequestMapping("findTree")
  @ResponseBody
  public List<TreeBean> findTree(){
 return   zhhservice.findTree();
  }


    /**
     * 查看是否喝酒下拉表
     * @return
     */
    @RequestMapping("findDrink")
    @ResponseBody
    public List<DrinkBean> findDrink() {

        return zhhservice.findDrink();
    }


    /**
     * 查看是否吸烟下拉表
     * @return
     */
    @RequestMapping("findSmoke")
    @ResponseBody
    public List<SmokeBean> findSmoke() {

        return zhhservice.findSmoke();
    }

    /**
     * 查看孩子下拉表
     * @return
     */
    @RequestMapping("findChildren")
    @ResponseBody
    public  List<ChildrenBean>  findChildren(){

        return   zhhservice.findChildren();
    }

    /**
     * 查看婚姻表
     * @return
     */
    @RequestMapping("findMaritalStatus")
    @ResponseBody
    public   List<MaritalStatusBean>  findMaritalStatus(){
             return   zhhservice.findMaritalStatus();
    }

    /**
     * 查看学历表
     * @return
     */
    @RequestMapping("findEducation")
    @ResponseBody
    public  List<EducationBean>  findEducation(){
            return   zhhservice.findEducation();
    }


    /**
     * 择偶表保存
     * @param partnerBean
     */
       @RequestMapping("savePartner")
      @ResponseBody
     public  void  savePartner(PartnerBean  partnerBean){
                 zhhservice.savePartner(partnerBean);
       }


    /**
     * 择偶表回显
     * @param userId
     * @return
     */
    @RequestMapping("findPartnerById")
    @ResponseBody
    public PartnerBean findPartnerById(Integer userId){

        return   zhhservice.findPartnerById(userId);
    }


}
