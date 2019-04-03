package com.icypt.learn.configuation;

import com.icypt.learn.service.Blog;
import com.icypt.learn.service.Movie;
import com.icypt.learn.service.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/3 21:32
 * version：1.0
 * description：
 */
@Configuration
public class UserConfig {
    @Bean
    public User getUser() {
        return new User("icypt");
    }
}
