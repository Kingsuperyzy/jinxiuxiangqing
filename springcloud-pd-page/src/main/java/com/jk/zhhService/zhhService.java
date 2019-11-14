package com.jk.zhhService;

import com.jk.model.*;

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
public interface zhhService {



    List<TreeBean> findTree();


    List<DrinkBean> findDrink();


    List<SmokeBean> findSmoke();

    List<ChildrenBean> findChildren();

    List<MaritalStatusBean> findMaritalStatus();

    List<EducationBean> findEducation();

    void savePartner(PartnerBean partnerBean);
}
