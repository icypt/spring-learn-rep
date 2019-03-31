package com.icypt.learn.service;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 13:23
 * version：1.0
 * description：
 */
public class Blog {

    private User user;

    public Blog() {}

    public Blog(User user) {
        this.user = user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void sayHello() {
        System.out.println("***************hello world!****************");
    }

    public void getUser() {
        user.getUser();
    }
}
