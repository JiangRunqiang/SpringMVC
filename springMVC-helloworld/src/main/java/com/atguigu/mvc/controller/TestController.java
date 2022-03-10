package com.atguigu.mvc.controller;
/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/2  10:18
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/param")
    public String param(){
        return "test_param";
    }

}
