package com.icypt.learn.service;

import com.icypt.learn.configuration.BeanConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;

import java.sql.SQLException;
import java.util.Properties;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 15:14
 * version：1.0
 * description：
 */
public class TestBeanConfig {
    private static AnnotationConfigApplicationContext afac = new AnnotationConfigApplicationContext();
    private static Logger logger = LoggerFactory.getLogger(TestBeanConfig.class);
    @Test
    public void testDataSourceConfig() throws SQLException {
        ConfigurableEnvironment environment = afac.getEnvironment();
//        environment.setDefaultProfiles("test");
        afac.register(BeanConfig.class);
        afac.refresh();
        if(afac.containsBean("getBlog")) {
            logger.info("getBlog bean 已创建成功");
        } else {
            logger.info("getBlog bean 没有被创建");
        }
    }
}
