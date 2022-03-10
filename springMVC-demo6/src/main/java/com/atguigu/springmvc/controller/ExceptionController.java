package com.atguigu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/8  16:22
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public  String testException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
