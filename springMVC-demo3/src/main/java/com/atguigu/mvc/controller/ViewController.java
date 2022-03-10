package com.atguigu.mvc.controller;
/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/3  15:35
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ViewController {
    //没有前缀才是thymeleafView
@RequestMapping("/testThymeleafview")
    public String testThymeleafview(){
        return "success";
}
@RequestMapping("/testForward")
    public String testForward(){

    return "forward:/testThymeleafview";
}
    // 重定向转发视图
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        // 重定向的也是一个请求，而不是一个页面
        // 同时 重定向不能访问web-inf目录下的资源，出于安全性，浏览器端不能访问的
        // 请求转发在服务器的内部进行转发，一次session，可以共享数据，因为只创建了一个对象

        // 请求转发
        //request.getRequestDispatcher().forward();
        // 请求重定向
        // response.sendRedirect();
        return "redirect:/testThymeleafview";

    }
}
