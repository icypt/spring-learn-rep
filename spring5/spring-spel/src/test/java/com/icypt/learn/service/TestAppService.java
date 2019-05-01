package com.icypt.learn.service;

import com.icypt.learn.configuration.JavaConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 16:04
 * version：1.0
 * description：
 */
public class TestAppService {
    public static final Logger logger = LoggerFactory.getLogger(TestAppService.class);
    public static AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JavaConfig.class);

    @Test
    public void TestToString() {
        AppService appService = acac.getBean("appService", AppService.class);
        logger.info(appService.toString());
    }
}
