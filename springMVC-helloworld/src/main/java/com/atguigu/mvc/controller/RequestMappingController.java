package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/2  10:28
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value={"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST}

    )
    public String  success(){
            return "success";
    }
    @GetMapping("/testGetMapping")
    public String testGetMapping(){
        return "success";
    }
    @RequestMapping(value = "/testPut",method =RequestMethod.PUT)
    public String testPut(){
        return "success";
    }
    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username","password!=123456"},
            headers = {"Host=localhost:8080"})
    public String testParams(){
        return "success";
    }
//    @RequestMapping("/a?a/testAnt")
//    @RequestMapping("/a*a/testAnt")
@RequestMapping("/a**a/testAnt")
public String testAnt(){
        return "success";
    }
@RequestMapping("/testPath/{id}/{username}")
public String testPath(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id);
        System.out.println("username"+username);
        return "success";
}
}
/*
value  headers 不匹配报404
method 不匹配报405
params 不匹配报400
 */