package com.icypt.learn.service;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 13:43
 * version：1.0
 * description：
 */
public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return "冰点IT-" + userName;
    }
}
