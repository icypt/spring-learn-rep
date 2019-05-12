package com.icypt.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class GetParamsAspect {
    public static Logger LOGGER = LoggerFactory.getLogger(GetParamsAspect.class);
    public void before(Long userId, String userName) {
        LOGGER.info("***********************进入前置通知**********************************");
        LOGGER.info("前置通知接受的userId:" + userId);
        LOGGER.info("前置通知接受的userName:" + userName);
    }
}
