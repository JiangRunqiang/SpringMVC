package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/1  16:09
 */
@Controller
public class HelloController {
   // “/” -->/WEB-INF/templates/index.html
    @RequestMapping(value = "/")
    public String index(){
        // 返回视图名称
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }

}
