package com.icypt.learn.service;

import java.util.List;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/31 21:36
 * version：1.0
 * description：
 */
public class Movie  {
    private String movieName;

    private User user;

    public Movie(String movieName, User user) {
        this.movieName = movieName;
        this.user = user;
    }

    public String getMovieInfo() {
        return "看" + this.movieName+ "的是：" + this.user.getUserName();
    }
}
