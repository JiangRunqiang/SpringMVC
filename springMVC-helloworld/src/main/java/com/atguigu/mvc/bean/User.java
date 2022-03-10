package com.atguigu.mvc.bean;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2021/12/3  9:31
 */

public class User {
    private Integer Id;
    private String username;
    private String password;
    private Integer age;
    private String email;
    private String sex;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String email, String sex) {
        Id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
