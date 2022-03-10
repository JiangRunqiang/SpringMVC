package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/8  21:59
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public  String index(){
        return "index";
    }
    @RequestMapping("/testException")
    public String testException(){
        System.out.println(1/0);
        return "error";
    }

   
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        return "success";
    }
}
