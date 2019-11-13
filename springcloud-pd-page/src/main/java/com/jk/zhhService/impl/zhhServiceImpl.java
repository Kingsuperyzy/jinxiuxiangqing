package com.jk.zhhService.impl;

import com.jk.model.TreeBean;
import com.jk.zhhMapper.zhhMapper;
import com.jk.zhhService.zhhService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

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
}
