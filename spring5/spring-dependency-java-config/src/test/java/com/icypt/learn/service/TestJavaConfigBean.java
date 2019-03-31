package com.icypt.learn.service;

import com.icypt.learn.config.JavaConfigBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 14:00
 * version：1.0
 * description：
 */
public class TestJavaConfigBean {

    private static AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JavaConfigBean.class);
    @Test
    public void createBean() {
        Blog blog = acac.getBean("getBlog", Blog.class);
        blog.sayHello();
        User user = acac.getBean("blogUser", User.class);
        user.getUser();
    }

    @Test
    public void dependencyBean() {
        Blog blog = acac.getBean("setBlog", Blog.class);
        blog.getUser();
    }
}
