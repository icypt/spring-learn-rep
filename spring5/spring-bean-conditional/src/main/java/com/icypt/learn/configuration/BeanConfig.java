package com.icypt.learn.configuration;

import com.icypt.learn.conditional.BlogBeanConditional;
import com.icypt.learn.service.Blog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 18:22
 * version：1.0
 * description：
 */
@Configuration
public class BeanConfig {
    @Bean
    @Conditional(BlogBeanConditional.class)
    public Blog getBlog() {
        return new Blog();
    }
}
