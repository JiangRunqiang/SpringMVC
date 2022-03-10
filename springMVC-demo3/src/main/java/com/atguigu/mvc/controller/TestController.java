package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/3  10:21
 */
// 这个控制器是专门实现页面跳转的
@Controller
public class TestController {
    // 只用请求地址匹配
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }
    // 实现页面跳转
    @RequestMapping("/test_view")
    public String testView(){
        return "test_view";
    }


}
