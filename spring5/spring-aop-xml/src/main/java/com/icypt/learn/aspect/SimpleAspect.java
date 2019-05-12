package com.icypt.learn.aspect;

import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:06
 * version：1.0
 * description：基本通知切面
 */
public class SimpleAspect {
    public static Logger logger = LoggerFactory.getLogger(SimpleAspect.class);
    /**
     * 前置通知方法
     */
    public void before() {
        logger.info("*************执行方法前调用*************");
    }

    /**
     * 后置通知方法
     */
    public void after() {
        logger.info("*************执行方法后或者抛出异常后调用*************");
    }

    /**
     * 异常通知方法
     */
    public void throwable() {
        logger.info("*************执行方法异常后调用*************");
    }

    /**
     * 返回通知方法
     */
    public void returning() {
        logger.info("*************执行方法后后调用, 异常不会调用*************");
    }
}
