package com.icypt.learn.service;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 16:01
 * version：1.0
 * description：
 */
public class AppService {
    private String appId;
    private String appName;

    public AppService(String appId, String appName) {
        this.appId = appId;
        this.appName = appName;
    }

    @Override
    public String toString() {
        return "AppService{" +
                "appId='" + appId + '\'' +
                ", appName='" + appName + '\'' +
                '}';
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
}
