package com.icypt.learn.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 13:06
 * version：1.0
 * description：
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @Profile("dev")
    public DataSource embeddedDataSource() {
        EmbeddedDatabaseBuilder edb = new EmbeddedDatabaseBuilder();
        //嵌入式数据库类型
        edb.setType(EmbeddedDatabaseType.H2);
        return edb.build();
    }

    @Bean
    @Profile("test")
    public DataSource basicDataSource() {
        BasicDataSource ads = new BasicDataSource();
        ads.setDriverClassName("com.mysql.jdbc.Driver");
        ads.setUrl("jdbc:mysql://localhost:3306/myDb");
        ads.setUsername("root");
        ads.setPassword("123");
        ads.setMaxActive(10);
        ads.setMaxIdle(5);
        ads.setMinIdle(1);
        ads.setInitialSize(20);
        return ads;
    }

    @Bean
    @Profile("pro")
    public DataSource dataSource() {
        JndiObjectFactoryBean jfb = new JndiObjectFactoryBean();
        jfb.setJndiName("jdbc/myDb");
        jfb.setResourceRef(true);
        jfb.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource) jfb.getObject();
    }

}
