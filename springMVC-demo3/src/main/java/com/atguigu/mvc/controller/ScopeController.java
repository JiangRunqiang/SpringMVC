package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/3  13:39
 */
@Controller
public class ScopeController {
    //使用ServletAPI向Request域对象共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,servletAPI");
        // 请求转发
        return  "success";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView=new ModelAndView();
        // 处理模型数据，即向请求域request共享数据
        modelAndView.addObject("testRequestScope","hello,modelandview");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","hello,Model");
        System.out.println(model.getClass().getName());
        return "success";
    }
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","hello,Map");
        System.out.println(map.getClass().getName());
        return "success";
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","helo ModelMap");
        System.out.println(modelMap.getClass().getName());
        return "success";
    }
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "success";
    }
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext appliction = session.getServletContext();
        appliction.setAttribute("testApplicationScope","hello,Application");
        return "success";
    }

}
