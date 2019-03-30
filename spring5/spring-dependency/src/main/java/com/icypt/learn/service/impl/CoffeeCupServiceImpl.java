package com.icypt.learn.service.impl;

import com.icypt.learn.service.CupService;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/29 21:18
 * version：1.0
 * description：
 */
@Component
public class CoffeeCupServiceImpl implements CupService {
    @Override
    public void drink() {
        System.out.println("*******喝咖啡*********");
    }
}


