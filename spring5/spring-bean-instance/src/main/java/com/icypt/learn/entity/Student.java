package com.icypt.learn.entity;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/1/2 20:31
 * version：1.0
 * description：
 */
public class Student {

    private String stuNo;
    private String stuName;
    private Integer stuAge;

    public Student() {
//        System.out.println("确实执行了构造方法");
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public void sayHello() {
        System.out.println("****************Spring你好！Spring HelloWord！******************");
    }
}
