package com.atguigu.springMVC.bean;
/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/8  9:34
 */

public class User {

    private Integer id;
    private String usename;
    private String password;
    private Integer age;
    private  String sex;

    public User(Integer id, String usename, String password, Integer age, String sex) {
        this.id = id;
        this.usename = usename;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }

    public User(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
