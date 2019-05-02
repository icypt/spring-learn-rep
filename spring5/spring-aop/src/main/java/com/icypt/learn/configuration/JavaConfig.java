package com.icypt.learn.configuration;

import com.icypt.learn.service.UserService;
import com.icypt.learn.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:14
 * version：1.0
 * description：
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.icypt")
public class JavaConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
