package com.icypt.learn;

import com.icypt.learn.configuration.GlobalConfig;
import com.icypt.learn.service.Mp3;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/20 11:04
 * version：1.0
 * description：
 */
public class TestAmbiguity {

    public static Logger logger = LoggerFactory.getLogger(TestAmbiguity.class);

    public static AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(GlobalConfig.class);

    @Test
    public void testAmbiguity() {
        if(acac.containsBean("mp3")) {
            Mp3 mp3 = acac.getBean("mp3", Mp3.class);
            logger.info(mp3.getMuiscType());
        } else {
            logger.info("mp3 bean创建失败！");
        }
    }

}
