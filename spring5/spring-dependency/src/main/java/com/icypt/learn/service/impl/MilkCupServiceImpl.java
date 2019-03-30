package com.icypt.learn.service.impl;

import com.icypt.learn.service.CupService;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/29 21:18
 * version：1.0
 * description：
 */
@Named("milkCup")
public class MilkCupServiceImpl implements CupService {
    @Override
    public void drink() {
        System.out.println("*******喝牛奶*********");
    }
}


