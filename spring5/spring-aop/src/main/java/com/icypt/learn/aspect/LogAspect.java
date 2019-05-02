package com.icypt.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:06
 * version：1.0
 * description：
 */
@Aspect
@Component
public class LogAspect {

    public static Logger logger = LoggerFactory.getLogger(LogAspect.class);

//    @Pointcut("execution(* com.icypt.learn.service.UserService.saveUser()))")
    @Pointcut("within(com.icypt.learn.service.impl.*)")
//    @Pointcut("this(com.icypt.learn.service.UserService)")
//    @Pointcut("target(com.icypt.learn.service.UserService)")
//    @Pointcut("bean(userService)")
//    @Pointcut("bean(userService)")
//    @Pointcut("args(long,..)")
//    @args表示传入参数的类是否被XX注解标签机
//    @Pointcut("@args(com.icypt.learn.annotation.LogAnnotationParam, ..)")
//    @Pointcut("@target(com.icypt.learn.annotation.LogAnnotationParam)")
//    @Pointcut("@within(com.icypt.learn.annotation.LogAnnotationParam)")
//    @Pointcut("@annotation(com.icypt.learn.annotation.LogAnnotationParam)")
    public void process() {
    }

    @Before("process()")
    public void before(JoinPoint joinPoint) {
        logger.info("*************进入前置通知*************");
    }
}
