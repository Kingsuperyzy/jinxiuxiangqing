package com.jk.zhhController;

import com.jk.model.TreeBean;
import com.jk.zhhService.zhhService;
import com.jk.zhhService.zhhServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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


    @Override
    public List<TreeBean> findTree() {
        return   zhhservice.findTree();
    }
}
