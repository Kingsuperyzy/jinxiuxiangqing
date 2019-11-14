package com.jk.zhhController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("page")
public class PageController {


    /**
     * 跳转到树页面
     * @return
     */
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }


    /**
     * 跳转到择偶页面
     * @return
     */
    @RequestMapping("toPartner")
    public String toPartner(Model model, Integer userId){
          model.addAttribute("partnerId",1);
        return "PartnerPage";
    }


}
