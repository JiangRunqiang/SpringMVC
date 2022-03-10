package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/5  15:23
 */
@Controller
@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping("/testRequestMapping")
    public String success(){
        return "success";
    }

}
