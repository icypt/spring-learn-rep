package com.icypt.learn.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 13:06
 * version：1.0
 * description：
 */
@Configuration
@Profile("dev")
public class DataSourceDevConfig {
    @Bean
    public DataSource embeddedDataSource() {
        EmbeddedDatabaseBuilder edb = new EmbeddedDatabaseBuilder();
        //嵌入式数据库类型
        edb.setType(EmbeddedDatabaseType.H2);
        return edb.build();
    }
}
