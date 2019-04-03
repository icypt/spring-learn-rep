package com.icypt.learn.configuation;

import com.icypt.learn.service.Blog;
import com.icypt.learn.service.Movie;
import com.icypt.learn.service.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/3 21:32
 * version：1.0
 * description：
 */
@Configuration
@Import({UserConfig.class})
public class UseUserConfig {

    @Bean
    public Movie getMovie(User user) {
        return new Movie("《湄公河行动》", user);
    }


    @Bean
    public Blog getBlog(User user) {
        return new Blog("《Spring5实战》", user);
    }

}
