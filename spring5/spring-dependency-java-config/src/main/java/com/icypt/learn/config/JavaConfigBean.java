package com.icypt.learn.config;

import com.icypt.learn.service.Blog;
import com.icypt.learn.service.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 13:21
 * version：1.0
 * description：
 */
@Configuration
public class JavaConfigBean {

    @Bean
    public Blog getBlog() {
        return new Blog();
    }

    @Bean("blogUser")
    public User  getUser() {
        return new User();
    }

    //通过构造方法注入方式1
    @Bean
    public Blog conBlog() {
        return new Blog(getUser());
    }

    //通过构造方法注入方式2，常用
    @Bean
    public Blog conBlogParams(User blogUser)  {
        return new Blog(blogUser);
    }

    //通过Setter方法注入方式1
    @Bean
    public Blog setBlog() {
        Blog blog = new Blog();
        blog.setUser(getUser());
        return blog;
    }

    //通过Setter方法注入方式2，常用
    @Bean
    public Blog setBlogParams(User user) {
        Blog blog = new Blog();
        blog.setUser(user);
        return blog;
    }

}
