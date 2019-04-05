package com.icypt.learn.service;

import com.icypt.learn.configuration.DataSourceDevConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 15:14
 * version：1.0
 * description：
 */
public class TestDataSourceXmlConfig {
    private static ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext();
    @Test
    public void testDataSourceConfig() throws SQLException {
        cac.getEnvironment().addActiveProfile("dev");
//        cac.setConfigLocation("dataSourceDevConfig.xml");
        cac.setConfigLocation("dataSourceConfig.xml");
        cac.refresh();
    }
}
