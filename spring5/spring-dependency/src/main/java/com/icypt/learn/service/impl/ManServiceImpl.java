package com.icypt.learn.service.impl;

import com.icypt.learn.service.CupService;
import com.icypt.learn.service.PersonService;
import com.icypt.learn.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/30 14:50
 * version：1.0
 * description：
 */
@Component
public class ManServiceImpl implements PersonService {

    @Autowired
    private CupService colaCupServiceImpl;

    private CupService coffeeCupServiceImpl;

    private ShopService smallShopServiceImpl;

    @Override
    public void drink() {
        colaCupServiceImpl.drink();;
        coffeeCupServiceImpl.drink();
    }

    @Autowired
    public ManServiceImpl(CupService coffeeCupServiceImpl) {
        this.coffeeCupServiceImpl = coffeeCupServiceImpl;
    }

    @Autowired(required = false)
    public void setSmallShopServiceImpl(ShopService smallShopServiceImpl) {
        this.smallShopServiceImpl = smallShopServiceImpl;
    }
}
