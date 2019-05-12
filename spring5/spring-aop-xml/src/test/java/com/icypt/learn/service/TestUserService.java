package com.icypt.learn.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:15
 * version：1.0
 * description：
 */
public class TestUserService {
    public static Logger logger = LoggerFactory.getLogger(TestUserService.class);
    public static ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("getParamsAspect.xml");
//    public static ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("aroundAspect.xml");
//    public static ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("simpleAspect.xml");
    @Test
    public void testSaveUser() {
        UserService userService = cpxac.getBean("userService", UserService.class);
        //调用目标方法
        boolean flag = userService.saveUser(1l,"daguo");
        logger.info("***********执行目标类saveUser方法结果：" + flag + "**********");
    }
}
