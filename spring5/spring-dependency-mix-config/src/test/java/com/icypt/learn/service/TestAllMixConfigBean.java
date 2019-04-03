package com.icypt.learn.service;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 14:00
 * version：1.0
 * description：
 */
public class TestAllMixConfigBean {

    public static org.slf4j.Logger logger = LoggerFactory.getLogger(TestAllMixConfigBean.class);

    public static ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext_entrance.xml");

    @Test
    public void testBlotConfig() {
        User user = cac.getBean("user", User.class);
        Movie movie = cac.getBean("movie", Movie.class);
        Blog blog = cac.getBean("blog", Blog.class);
        logger.info(user.getUserName());
        logger.info(movie.getMovieInfo());
        logger.info(blog.getBlogInfo());
    }
}
