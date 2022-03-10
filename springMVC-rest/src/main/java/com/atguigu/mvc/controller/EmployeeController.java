package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.Employee;
import com.atguigu.mvc.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/7  10:34
 */
@Controller
public class EmployeeController {
    /*自动装配*/
    @Autowired
    private EmployeeDao employeeDao;


    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList",employeeList);
         return"employee_list";
    }
   @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";// 重定向的get请求
    }
    @PostMapping("/employee")
    public String addEmployee(Employee employee){
         employeeDao.save(employee);
         return "redirect:/employee";
    }

    @GetMapping(value ="/employee/{id}" )
    public String getEmployeeById(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }
    @PutMapping(value = "/employee")
    public String updateEmployee(Employee employee){
           employeeDao.save(employee);
        return "redirect:/employee";

    }


}
