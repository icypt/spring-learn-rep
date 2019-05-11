package com.icypt.learn.service.impl;

import com.icypt.learn.service.EnhanceUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EnhanceUserServiceImpl implements EnhanceUserService  {
    public static Logger logger = LoggerFactory.getLogger(EnhanceUserServiceImpl.class);
    @Override
    public boolean update() {
        logger.info("************执行增强后新增的update方法****************");
        return false;
    }
}
