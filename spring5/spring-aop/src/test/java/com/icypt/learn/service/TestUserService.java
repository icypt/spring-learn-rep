package com.icypt.learn.service;

import com.icypt.learn.configuration.JavaConfig;
import com.icypt.learn.aspect.LogAspect;
import com.icypt.learn.entity.User;
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
    public static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    public static AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JavaConfig.class);


    @Test
    public void testSaveUser() {
        UserService userService = acac.getBean("userService", UserService.class);
        boolean flag = userService.saveUser(new User(),"daguo");
        if(flag) {
            logger.info("保存成功");
        } else {
            logger.info("保存失败");
        }
    }
}
