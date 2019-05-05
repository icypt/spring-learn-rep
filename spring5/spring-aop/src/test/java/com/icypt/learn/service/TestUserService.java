package com.icypt.learn.service;

import com.icypt.learn.aspect.SimpleAspect;
import com.icypt.learn.configuration.JavaConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:15
 * version：1.0
 * description：
 */
public class TestUserService {
    public static AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JavaConfig.class);
    @Test
    public void testSaveUser() {
        UserService userService = acac.getBean("userService", UserService.class);
        //调用目标方法
        userService.saveUser(1l,"daguo");
    }
}
