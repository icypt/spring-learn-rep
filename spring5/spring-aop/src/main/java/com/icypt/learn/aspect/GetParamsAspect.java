package com.icypt.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class GetParamsAspect {
    public static Logger LOGGER = LoggerFactory.getLogger(GetParamsAspect.class);



    @Pointcut("execution(* com.icypt.learn.service.UserService.saveUser(Long, String)) && args(userId,userName)")
    public void process(Long userId, String userName) {}





    @Pointcut("execution(* com.icypt.learn.service.UserService.saveUser(..))")
    public void process1() {}

    @Before("process(userId, userName)")
    public void before(Long userId, String userName) {
        LOGGER.info("***********************进入前置通知**********************************");
        LOGGER.info("前置通知接受的userId:" + userId);
        LOGGER.info("前置通知接受的userName:" + userName);
    }

    @After("process1()")
    public void after(JoinPoint jp) {
        LOGGER.info("***********************进入后置通知**********************************");
        //获取目标方法所有的参数
        Object[] args = jp.getArgs();
        for(int i=0; i < args.length; i++) {
            LOGGER.info("第" + i + "个参数的值为：" + args[i]);
        }
        //获取目标方法信息
        Class clazz = jp.getSignature().getDeclaringType();
        LOGGER.info("目标方法执行对象完整类名称：" + clazz.getName());
        LOGGER.info("目标方法执行对简单类名称：" + clazz.getSimpleName());
    }
}
