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
public class TestMixXmlConfigBean {

    public static org.slf4j.Logger logger = LoggerFactory.getLogger(TestMixXmlConfigBean.class);
    public static ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("applicationContext_mix_entrance.xml");

    @Test
    public void testBlotConfig() {
        User user = cac.getBean("getUser", User.class);
        Food food = cac.getBean("food", Food.class);
        Blog blog = cac.getBean("blog", Blog.class);
        logger.info(user.getUserName());
        logger.info(food.getFoodName());
        logger.info(blog.getBlogInfo());
    }
}
