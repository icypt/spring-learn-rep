package com.icypt.learn.service;

import com.icypt.learn.configuration.JavaConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 16:04
 * version：1.0
 * description：
 */
public class TestUserService {
    public static final Logger logger = LoggerFactory.getLogger(TestUserService.class);
    public static ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("application.xml");

    @Test
    public void TestToString() {
        UserService userService = cpxac.getBean("userService", UserService.class);
        logger.info(userService.toString());
    }
}
