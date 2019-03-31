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
    private String movieDesc;
    private Double price;
    private User user;
    private List<String> movieTags;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMovieTags(List<String> movieTags) {
        this.movieTags = movieTags;
    }

    public void printMovieInfo() {
        System.out.println("********电影名称************" + this.movieName);
        System.out.println("********电影描述************" + this.movieDesc);
        System.out.println("********电影价格************" + this.price + "元");
        String tags = "";
        for(String str : movieTags) {
            tags += str + ",";
        }
        System.out.println("********电影标签************{" + tags.substring(0, tags.lastIndexOf(",")) +"}");
    }

}
