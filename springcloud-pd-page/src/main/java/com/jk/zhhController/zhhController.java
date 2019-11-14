package com.jk.zhhController;

import com.jk.model.*;
import com.jk.zhhService.zhhService;
import com.jk.zhhService.zhhServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class zhhController implements zhhServices{


    @Autowired
    private zhhService zhhservice;


    /**
     * 查询左侧树
     * @return
     */
    @Override
    public List<TreeBean> findTree() {
        return   zhhservice.findTree();
    }



    /**
     * 查询是否喝酒下拉
     * @return
     */
    @Override
    public  List<DrinkBean> findDrink() {
        return zhhservice.findDrink();
    }

    /**
     * 查询是否吸烟下拉
     * @return
     */
    @Override
    public List<SmokeBean> findSmoke() {
        return zhhservice.findSmoke();
    }

    /**
     * 查询孩子表
     * @return
     */
    @Override
    public List<ChildrenBean> findChildren() {
        return zhhservice.findChildren();
    }

    /**
     * 查询婚姻表
     * @return
     */
    @Override
    public List<MaritalStatusBean> findMaritalStatus() {
        return zhhservice.findMaritalStatus();
    }

    /**
     * 查看学历表
     * @return
     */
    @Override
    public List<EducationBean> findEducation() {
        return zhhservice.findEducation();
    }

    /**
     * 择偶表保存
     * @param partnerBean
     */
    @Override
    public void savePartner(PartnerBean partnerBean) {
        zhhservice.savePartner(partnerBean);
    }

    /**
     * 择偶表回显
     * @param userId
     * @return
     */
    @Override
    public PartnerBean findPartnerById(Integer userId) {
        return zhhservice.findPartnerById(userId);
    }


}
