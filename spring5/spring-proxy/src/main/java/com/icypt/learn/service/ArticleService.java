package com.icypt.learn.service;

import java.util.HashMap;
import java.util.Map;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 22:40
 * version：1.0
 * description：文章服务类，没有实现接口
 */
public class ArticleService {
    /**
     * 插入文章
     * @return
     */
    public Boolean insertArticle() {
        return true;
    }

    /**
     * 根据文章ID获取文章名称
     * @param id
     * @return
     */
    public String queryArticleNameById(Long id) {
        //文章数据模拟
        Map<Long, String> articleNameMap = new HashMap<>();
        articleNameMap.put(1l, "Spring 实战");
        articleNameMap.put(2l, "Spring boot 实战");
        articleNameMap.put(3l, "Spring cloud 实战");
        return articleNameMap.get(id);
    }
}
