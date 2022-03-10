package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/8  14:08
 */
@Controller
public class TestController {

    @RequestMapping("/**//testInterceptor")
    public String testInterceptor(){
      return "success";
    }
    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println(1/0);
        return "success";
    }
}
