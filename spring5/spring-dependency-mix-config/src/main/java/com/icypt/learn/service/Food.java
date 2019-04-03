package com.icypt.learn.service;

import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/3 23:15
 * version：1.0
 * description：
 */
@Component
public class Food {
    private String foodName = "冰激凌！";

    public Food() {}

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return "爱吃的" + foodName;
    }
}
