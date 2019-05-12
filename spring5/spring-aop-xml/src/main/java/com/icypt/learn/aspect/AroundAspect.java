package com.icypt.learn.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:06
 * version：1.0
 * description： 环绕通知切面
 */
public class AroundAspect {
    public static Logger logger = LoggerFactory.getLogger(AroundAspect.class);
    public Object around(ProceedingJoinPoint pjp) {
        Object object = null;
        logger.info("*************执行方法前调用*************");
        try {
            object =  pjp.proceed();
            logger.info("*************执行方法后后调用, 异常不会调用*************");
        } catch (Throwable throwable) {
            logger.error("*************执行方法异常后调用*************", throwable);
        } finally {
            logger.info("*************执行方法后或者抛出异常后调用*************");
        }
        return object;
    }
}
