package com.atguigu.springMVC.controller;

import com.atguigu.springMVC.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/7  16:19
 */
@Controller
public class HttpController {

    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody:"+requestBody);
        return "success";
    }
    @PostMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        // 当前requestEntity表示这个请求报文的信息
        System.out.println("请求头："+requestEntity.getHeaders());
        System.out.println("请求体的信息："+requestEntity.getBody());
        System.out.println("请求方法："+requestEntity.getMethod());
        System.out.println("请求的URL："+requestEntity.getUrl());
        System.out.println("请求的类型： "+requestEntity.getType());
        return "success";
    }
    @RequestMapping("/testResponse")
    public String testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().write("hello,response");
        return null;
    }
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        //这次响应的是字符串类型
        // 加上这个注解以后，return的数据就变成了浏览器响应数据的响应体了
        return "success";
    }
    /*
    *  @ResponseBody 加上这个注解后，当前方法的返回值就是响应到浏览器中的数据
    *
    *
    * */
    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        User user = new User();
        user.setAge(11);
        user.setId(101);
        user.setPassword("123456");
        user.setUsename("admin");
        user.setSex("male");
        // json数据交互格式，生成的数据格式简单与XML相比
        return user;
    }
    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username,String password){
        System.out.println(username+","+password);
        return "hello,axios";
    }

}
