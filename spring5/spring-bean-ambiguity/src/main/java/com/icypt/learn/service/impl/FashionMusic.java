package com.icypt.learn.service.impl;

import com.icypt.learn.service.Music;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/20 10:51
 * version：1.0
 * description：
 */
@Component
@Primary
@Qualifier("fashion")
public class FashionMusic implements Music {
    @Override
    public String getMusicType() {
        return "流行音乐";
    }
}
