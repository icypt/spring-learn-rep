package com.icypt.learn.service;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 13:23
 * version：1.0
 * description：
 */
public class Blog {

    private String blogName;

    private User user;

    public Blog(String blogName, User user) {
        this.blogName = blogName;
        this.user = user;
    }

    public String getBlogInfo() {
        return "看" + this.blogName+ "的是：" + this.user.getUserName();
    }
}
