package com.icypt.learn.service.impl;

import com.icypt.learn.service.Music;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/20 10:51
 * version：1.0
 * description：
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getMusicType() {
        return "古典音乐";
    }
}
