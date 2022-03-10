package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/7  8:41
 */
@Controller
public class JSPController {

    @RequestMapping("/testJSP")
    public String  testJSP(){
        return "success";
    }

}
