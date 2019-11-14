package com.jk.yscontroller;

import com.jk.model.*;
import com.jk.ysservice.YsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ys")
public class YsController{
    @Autowired
    private YsService ysService;

    /**
     * 跳转到基本资料页面
     * @param model
     * @param userId
     * @return
     */
    @RequestMapping("toBasicData")
    public String toBasicData(Model model,Integer userId){
        UserBean userById = ysService.findUserById(1);
        model.addAttribute("user",userById);
        return "basicData";
    }

    /**
     * 跳转到详细资料页面
     * @param model
     * @param userId
     * @return
     */
    @RequestMapping("toDetailedInformation")
    public String toDetailedInformation(Model model,Integer userId){
        model.addAttribute("userId",1);
        return "detailedInformation";
    }

 /**
     * 跳转到详细资料页面
     * @param model
     * @param userId
     * @return
     */
    @RequestMapping("toHobby")
    public String toHobby(Model model,Integer userId){
        model.addAttribute("userId",1);
        return "toHobby";
    }


    /**
     * 测试
     * @return
     */
    @RequestMapping("user")
    @ResponseBody
    public String user(){
      return   ysService.user();
    }


    /**
     * 详细资料回显
     * @param userId
     * @return
     */
    @RequestMapping("findUserById")
    @ResponseBody
    public UserBean findUserById(Integer userId){

      return   ysService.findUserById(userId);
    }
  /**
     * 兴趣爱好回显
     * @param userId
     * @return
     */
    @RequestMapping("findHobbyById")
    @ResponseBody
    public HobbyBean findHobbyById(Integer userId){

      return   ysService.findHobbyById(userId);
    }


    /**
     * 修改 详细资料
     * @param userBean
     * @return
     */
    @RequestMapping("updateUser")
    @ResponseBody
    public Boolean updateUser(UserBean userBean){
        try {
            ysService.updateUser(userBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
  /**
     * 修改 详细资料
     * @param detailsBean
     * @return
     */
    @RequestMapping("updateDetailUser")
    @ResponseBody
    public Boolean updateDetailUser(DetailsBean detailsBean){
        try {
            ysService.updateDetailUser(detailsBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }



    /**
     * 查询体型
     * @return
     */
    @RequestMapping("queryshapeid")
    @ResponseBody
    public List<ShapeBean> queryshapeid(){
        return ysService.queryshapeid();
    }
 /**
     * 查询查询民族
     * @return
     */
    @RequestMapping("querynationid")
    @ResponseBody
    public List<NationBean> querynationid(){
        return ysService.querynationid();
    }

  /**
     * 查询星座
     * @return
     */
    @RequestMapping("queryconstellationid")
    @ResponseBody
    public List<ConstellationBean> queryconstellationid(){
        return ysService.queryconstellationid();
    }

  /**
     * 查询孩子
     * @return
     */
    @RequestMapping("querychildrenid")
    @ResponseBody
    public List<ChildrenBean> querychildrenid(){
        return ysService.querychildrenid();
    }

/**
     * 查询结婚
     * @return
     */
    @RequestMapping("querymarriedid")
    @ResponseBody
    public List<MarriedBean> querymarriedid(){
        return ysService.querymarriedid();
    }


    /**
     * 基本资料回显
     * @param userId
     * @return
     */
    @RequestMapping("findDetailById")
    @ResponseBody
    public DetailsBean findDetailById(Integer userId){
        return ysService.findDetailById(userId);
    }



    /**
     * 修改 兴趣爱好
     * @param hobbyBean
     * @return
     */
    @RequestMapping("updateHobby")
    @ResponseBody
    public Boolean updateHobby(HobbyBean hobbyBean){
        try {
            ysService.updateHobby(hobbyBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }



    /**
     * 跳转到工作生活页面
     * @param model
     * @param userId
     * @return
     */
    @RequestMapping("toWorkLife")
    public String toWorkLife(Model model,Integer userId){
        model.addAttribute("userId",1);
        return "workLife";
    }


    /**
     * 工作生活回显
     * @param userId
     * @return
     */
    @RequestMapping("findWorkById")
    @ResponseBody
    public LifeBean findWorkById(Integer userId){
        return ysService.findWorkById(userId);
    }

    /**
     * 查询是否买房
     * @return
     */
    @RequestMapping("queryhousingsituationid")
    @ResponseBody
    public List<HousingSituationBean> queryhousingsituationid(){
        return ysService.queryhousingsituationid();
    }


   /**
     * 查询是否买车
     * @return
     */
    @RequestMapping("querycarsituationid")
    @ResponseBody
    public List<CarSituationBean> querycarsituationid(){
        return ysService.querycarsituationid();
    }


 /**
     * 查询是否抽烟
     * @return
     */
    @RequestMapping("querysmokeid")
    @ResponseBody
    public List<SmokeBean> querysmokeid(){
        return ysService.querysmokeid();
    }


/**
     * 查询是否喝酒
     * @return
     */
    @RequestMapping("querydrinkid")
    @ResponseBody
    public List<DrinkBean> querydrinkid(){
        return ysService.querydrinkid();
    }


    /**
     * 修改 兴趣爱好
     * @param
     * @return
     */
    @RequestMapping("updateWorkUser")
    @ResponseBody
    public Boolean updateWorkUser(LifeBean lifeBean){
        try {
            ysService.updateWorkUser(lifeBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }




}
