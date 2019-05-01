package com.icypt.learn.service;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 16:47
 * version：1.0
 * description：
 */
public class UserService {
    private String userName;
    private String password;
    private String appId;
    private String appName;
    private List<UserTag> tagList;

    public UserService(String userName, String password, String appId, String appName) {
        this.userName = userName;
        this.password = password;
        this.appId = appId;
        this.appName = appName;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", appId='" + appId + '\'' +
                ", appName='" + appName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public List<UserTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<UserTag> tagList) {
        this.tagList = tagList;
    }
}
