package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/5  14:55
 */
@Controller
public class testController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/param")
    public String testParam(){
        return "test_param";
    }
}
