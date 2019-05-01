package com.icypt.learn.configuration;

import com.icypt.learn.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 15:25
 * version：1.0
 * description：
 */
@Configuration
@PropertySource(value = "classpath:app.properties", encoding = "UTF-8")
public class JavaConfig {
    @Autowired
    private Environment environment;

//    @Bean
//    public AppService appService() {
//        return  new AppService(environment.getRequiredProperty("app.id"), environment.getProperty("app.name"));
//    }

    @Bean
    public AppService appService(@Value("app.id")String appId, @Value("${app.name}") String appName) {
        return  new AppService(appId, appName);
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
