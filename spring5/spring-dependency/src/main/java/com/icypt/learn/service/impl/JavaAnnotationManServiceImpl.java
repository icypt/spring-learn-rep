package com.icypt.learn.service.impl;

import com.icypt.learn.service.CupService;
import com.icypt.learn.service.PersonService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/30 14:50
 * version：1.0
 * description：
 */
@Named
public class JavaAnnotationManServiceImpl implements PersonService {

    @Inject
    private CupService colaCupServiceImpl;

    private CupService coffeeCupServiceImpl;

    @Override
    public void drink() {
        colaCupServiceImpl.drink();;
        coffeeCupServiceImpl.drink();
    }

    @Inject
    public JavaAnnotationManServiceImpl(CupService coffeeCupServiceImpl) {
        this.coffeeCupServiceImpl = coffeeCupServiceImpl;
    }
}
