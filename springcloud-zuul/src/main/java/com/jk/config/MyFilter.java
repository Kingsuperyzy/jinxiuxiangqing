package com.jk.config;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * author：wdd
 * create time:2019/11/8
 * email：
 * tel：
 */
//讲当前自定义过滤器注入到容器中
@Component
public class MyFilter extends ZuulFilter {



    /**
     * 返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    //过滤的顺序  级别 数值越小，级别越高
    @Override
    public int filterOrder() {
        return 0;
    }

    //这里可以写逻辑判断，是否要过滤，true：过滤 false:不过滤。
    @Override

    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        System.out.println(requestURL);
        if(requestURI.equals("/zuul/zuul/tologin") || requestURI.equals("/zuul/tologin") )
        {//登录请求
            System.out.println("放开登录请求");
            return false;
        }
        return false;
    }

    //定义过滤规则
    @Override
    public Object run() throws ZuulException {
        System.out.println("进去过滤器。。。。。。。。。");
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        HttpSession session = request.getSession();
        Object username =  session.getAttribute("user");
        if(username==null){//未登录
            System.out.println("未登录，请求拦截");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(403);
            //假装登录

        }else {//登录
            System.out.println("已经登录，请求成功");
            currentContext.setSendZuulResponse(true);
        }
        return null;
    }
}
