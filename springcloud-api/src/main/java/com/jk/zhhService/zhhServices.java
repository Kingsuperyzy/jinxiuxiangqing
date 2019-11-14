package com.jk.zhhService;

import com.jk.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
@FeignClient(value ="pd-page")
public interface zhhServices {

    /**
     *查询左侧树
     * @return
     */
     @GetMapping("findTree")
     List<TreeBean> findTree();


    /**
     * 查询是否喝酒
     * @return
     */
    @GetMapping("findDrink")
    List<DrinkBean> findDrink();



    /**
     * 查询是否吸烟
     * @return
     */
    @GetMapping("findSmoke")
    List<SmokeBean> findSmoke();

    /**
     * 查询孩子表
     * @return
     */
    @GetMapping("findChildren")
    List<ChildrenBean> findChildren();

    /**
     * 查询婚姻表
     * @return
     */
    @GetMapping("findMaritalStatus")
    List<MaritalStatusBean> findMaritalStatus();

    /**
     * 查看学历表
     * @return
     */
    @GetMapping("findEducation")
    List<EducationBean> findEducation();

    /**
     * 择偶表保存
     * @param partnerBean
     */
    @PostMapping("savePartner")
    void savePartner(@RequestBody PartnerBean partnerBean);
}
