package com.icypt.learn.service;

import com.icypt.learn.service.impl.CoffeeCupServiceImpl;
import com.icypt.learn.service.impl.MilkCupServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/29 21:51
 * version：1.0
 * description：
 */
public class TestCupService {


    public static ClassPathXmlApplicationContext getCtx() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        return ctx;
    }

    @Test
    public void testDrinkCoffee() {
        CupService cupService =  getCtx().getBean("coffeeCupServiceImpl", CoffeeCupServiceImpl.class);
        cupService.drink();
    }

    @Test
    public void testDrinkMilk() {
        CupService cupService =  getCtx().getBean("milkCup", MilkCupServiceImpl.class);
        cupService.drink();
    }

}
