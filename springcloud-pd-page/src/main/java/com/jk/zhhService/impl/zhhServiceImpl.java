package com.jk.zhhService.impl;

import com.jk.model.*;
import com.jk.zhhMapper.zhhMapper;
import com.jk.zhhService.zhhService;

import org.springframework.beans.factory.annotation.Autowired;

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
@Service
public class zhhServiceImpl implements zhhService {

  @Autowired
    private zhhMapper zhhmapper;


    /**
     * 查询树
     * @return
     */
    @Override
    public List<TreeBean> findTree() {
        // TODO Auto-generated method stub
        Integer id=0;
        return treeNode(id);
    }




    private List<TreeBean> treeNode(Integer id) {
        List<TreeBean> trees =zhhmapper.findTree(id);
        for (TreeBean treeBean : trees) {
            Integer id2 = treeBean.getId();
            List<TreeBean> treeNode = treeNode(id2);
            if(treeNode !=null  && treeNode.size()>0){
                treeBean.setNodes(treeNode);
            }else{

                treeBean.setSelectable(true);
            }
        }
        return trees;
    }


    /**
     * 查询是否喝酒下拉
     * @return
     */
    @Override
    public  List<DrinkBean> findDrink() {

        return zhhmapper.findDrink();
    }

    /**
     * 查询是否吸烟下拉
     * @return
     */
    @Override
    public List<SmokeBean> findSmoke() {
        return zhhmapper.findSmoke();
    }

    /**
     * 查询孩子表
     * @return
     */
    @Override
    public List<ChildrenBean> findChildren() {
        return zhhmapper.findChildren();
    }

    /**
     * 查询婚姻表
     * @return
     */
    @Override
    public List<MaritalStatusBean> findMaritalStatus() {
        return zhhmapper.findMaritalStatus();
    }


    /**
     * 查看学历表
     * @return
     */
    @Override
    public List<EducationBean> findEducation() {
        return zhhmapper.findEducation();
    }

    /**
     * 择偶表保存
     * @param partnerBean
     */
    @Override
    public void savePartner(PartnerBean partnerBean) {
        zhhmapper.savePartner(partnerBean);
    }

    /**
     * 择偶表回显
     * @param userId
     * @return
     */
    @Override
    public PartnerBean findPartnerById(Integer userId) {
        return zhhmapper.findPartnerById(userId);
    }
}
