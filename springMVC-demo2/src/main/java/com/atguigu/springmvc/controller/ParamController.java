package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/5  15:37
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testParam(HttpServletRequest request){
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username);
        System.out.println("password: "+password);
        return "success";

    }
    @RequestMapping("/testParam")
    public String testParam2(@RequestParam(value = "user_name",required =true,defaultValue = "hehhe") String username,
                             String password,
                             String[] hobby,
                             @RequestHeader(value = "Host",required = false) String host,
                             @CookieValue("JSESSIONID") String JSESSIONID){
        //若请求参数中出现多个同名的请求参数,可以在控制器方法的形参位置设置字符串类型或者字符串类型的数组,来接收请求参数
        // 若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接的结果
        System.out.println("username:"+username+","+"password:"+password+",hobby: "+hobby.toString());
        System.out.println("host: "+host);
        System.out.println("jsessionid:"+JSESSIONID);
        return  "success";
    }

    @RequestMapping("/testbean")
    public String testPojo(User user){
        System.out.println(user.toString());
        return "success";
    }
}
