package com.icypt.learn.service;

import com.icypt.learn.configuation.BeanConfig;
import com.icypt.learn.configuation.EntranceConfig;
import com.icypt.learn.configuation.UseUserConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 14:00
 * version：1.0
 * description：
 */
public class TestMixConfigBean {

    public static org.slf4j.Logger logger = LoggerFactory.getLogger(TestMixConfigBean.class);

//    public static AnnotationConfigApplicationContext acpc = new AnnotationConfigApplicationContext(BeanConfig.class);
//    public static AnnotationConfigApplicationContext acpc = new AnnotationConfigApplicationContext(UseUserConfig.class);
    public static AnnotationConfigApplicationContext acpc = new AnnotationConfigApplicationContext(EntranceConfig.class);

    @Test
    public void testBlotConfig() {
        User user = acpc.getBean("getUser", User.class);
        Movie movie = acpc.getBean("getMovie", Movie.class);
        Blog blog = acpc.getBean("getBlog", Blog.class);
        logger.info(user.getUserName());
        logger.info(movie.getMovieInfo());
        logger.info(blog.getBlogInfo());
    }
}
