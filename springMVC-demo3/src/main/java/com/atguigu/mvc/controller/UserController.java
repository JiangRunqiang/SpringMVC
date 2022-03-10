package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/7  9:14
 */
@Controller
public class UserController {

    /*使用RESTful模拟用户资源的增删改查
     * /user     GET请求、 查询所有用户信息
     * /user/1     GET请求、 根据用户ID查询用户信息
     * /user      POST请求、 添加用户信息
     * /user/1     DELETE请求、 删除用户信息
     * /user     PUT请求、      更新用户信息
     * */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String testAlluser() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(Integer id) {
        System.out.println("根据用户ID查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(String username, String password) {
        System.out.println("用户名为：" + username + ",密码为：" + password);
        System.out.println("添加用户信息");
        return "success";
    }

    @RequestMapping(value="/user",method = RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户信息："+username+","+password);
        return  "success";
    }


}



