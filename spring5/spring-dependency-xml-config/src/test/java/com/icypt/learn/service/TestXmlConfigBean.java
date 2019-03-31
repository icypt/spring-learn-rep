package com.icypt.learn.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 14:00
 * version：1.0
 * description：
 */
public class TestXmlConfigBean {
    private static ClassPathXmlApplicationContext acac = new ClassPathXmlApplicationContext("application.xml");

    @Test
    public void baseTest() {
        Blog blog = acac.getBean("blog", Blog.class);
        blog.sayHello();
    }

    @Test
    public void testPrintTags() {
        Blog blog = acac.getBean("blog", Blog.class);
        blog.printBlogTags();
    }

    @Test
    public void testPrintMovieInfo() {
        Movie movie = acac.getBean("movie", Movie.class);
        movie.printMovieInfo();
    }

}
