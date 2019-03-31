package com.icypt.learn.service;

import java.util.List;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 13:23
 * version：1.0
 * description：
 */
public class Blog {

    private User user;

    private String blogName;

    private String blogTitle;

    private Integer blogSort;

    private List<String> blogTags;

    public Blog(String blogName, String blogTitle, Integer blogSort, List<String> blogTags) {
        this.blogName = blogName;
        this.blogTitle = blogTitle;
        this.blogSort = blogSort;
        this.blogTags = blogTags;
    }

    public Blog(User user) {
        this.user = user;
    }

    public Blog() {

    }

    public void sayHello() {
        System.out.println("***************hello world!****************");
    }

    public void printBlogTags() {
        for(String tag : this.blogTags) {
            System.out.println("**********" + tag);
        }
    }
}
