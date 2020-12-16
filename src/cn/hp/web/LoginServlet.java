package cn.hp.web;

import cn.hp.exception.Weather;

import javax.servlet.*;
import java.io.IOException;

/**
 *  servlet 做的事情，接收一个请求， 给出一个响应
 *   ？ 请求是一个路径 , 为什么一路径会蹦到一个类中来；
 *   servlet 将一个类 与 一个路径相绑定 ；
 *   servlet web小组件
 *      web三大组件：  servlet小组件   listener监听器  filter过滤器
 *
 *   将一个类变成servlet的方式
 *          1、实现servelet接口，要实现servlet中的全部方法，
 *              init  service  destroy 三个方法是servlet的生命周期( 从出生 --> 干活 --> 死亡 )方法
 *                  程序的生命周期： 按照你们计划得毕设项目，
 *
 */

public class LoginServlet implements Servlet{
    
//    init方法，生命周期 初始化方法，只会在当前类第一次被调用时进行执行；
//    参数servletConfig serlvetConfig的配置，
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
//       Weather w =  Weather.spring;
       System.out.println("init..." + servletConfig.getInitParameter("aaa"));
//       while (servletConfig.getInitParameterNames().hasMoreElements()){
//           System.out.println(servletConfig.getInitParameterNames().nextElement());
//       }
    }

//    获取servlet的配置信息
    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig...");
        return null;
    }

    // 每请求一次这个路径 就会执行一次service方法， 所以此方法中用来写主要业务内容；
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
//        在页面中显示什么内容，或者跳转到哪个具体页面  都是通过 service方法来操作的
        servletResponse.getWriter().println("");
        System.out.println("service...");
    }

//     获取servlet的 信息
    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo...");
        return null;
    }

//    代表着servlet的死亡，用于关闭资源  只会执行一次；
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
