package com.icypt.learn.service;

import java.util.List;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 18:34
 * version：1.0
 * description：
 */
public class ExpressionService {
    private Long currentTimeMilis;
    private UserService userService;
    private Double salary;
    private Integer randomNum;
    private Integer baseOperator;
    private String trinocular;
    private Boolean regex;
    private String queryFirst;
    private String queryLast;
    private List<String> projection;
    private String appId;
    private String javaVersion;
    private String appName;
    private String arrayFirst;

    public Long getCurrentTimeMilis() {
        return currentTimeMilis;
    }

    public void setCurrentTimeMilis(Long currentTimeMilis) {
        this.currentTimeMilis = currentTimeMilis;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(Integer randomNum) {
        this.randomNum = randomNum;
    }

    public Integer getBaseOperator() {
        return baseOperator;
    }

    public void setBaseOperator(Integer baseOperator) {
        this.baseOperator = baseOperator;
    }

    public String getTrinocular() {
        return trinocular;
    }

    public void setTrinocular(String trinocular) {
        this.trinocular = trinocular;
    }

    public Boolean getRegex() {
        return regex;
    }

    public void setRegex(Boolean regex) {
        this.regex = regex;
    }

    public String getQueryFirst() {
        return queryFirst;
    }

    public void setQueryFirst(String queryFirst) {
        this.queryFirst = queryFirst;
    }

    public String getQueryLast() {
        return queryLast;
    }

    public void setQueryLast(String queryLast) {
        this.queryLast = queryLast;
    }

    public List<String> getProjection() {
        return projection;
    }

    public void setProjection(List<String> projection) {
        this.projection = projection;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getArrayFirst() {
        return arrayFirst;
    }

    public void setArrayFirst(String arrayFirst) {
        this.arrayFirst = arrayFirst;
    }
}
