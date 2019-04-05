package com.icypt.learn.service;

import com.icypt.learn.configuration.DataSourceConfig;
import com.icypt.learn.configuration.DataSourceDevConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.SQLException;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 15:14
 * version：1.0
 * description：
 */
public class TestDataSourceConfig {
    private static AnnotationConfigApplicationContext afac = new AnnotationConfigApplicationContext();
    @Test
    public void testDataSourceConfig() throws SQLException {
        afac.getEnvironment().addActiveProfile("dev");
//        afac.register(DataSourceConfig.class);
        afac.register(DataSourceDevConfig.class);
        afac.refresh();
    }
}
