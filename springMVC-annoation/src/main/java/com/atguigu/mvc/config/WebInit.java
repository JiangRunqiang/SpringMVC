package com.atguigu.mvc.config;
/*
 *@author: Runqiang_Jiang@SAIC-GM.com
 *@Time: 2022/3/8  16:40
 */

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//web工程的初始化类，用来代替web.xml
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*指定Spring的配置类
    * */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    /*指定SpringMVC的配置类*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }
    /*指定DispatcherServlet的映射规则，即url-pattern*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /*用来注策过滤器*/
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        HiddenHttpMethodFilter hiddenHttpMethodFilter=new HiddenHttpMethodFilter();

        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
