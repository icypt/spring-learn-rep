package com.icypt.learn.aspect;

import com.icypt.learn.service.EnhanceUserService;
import com.icypt.learn.service.impl.EnhanceUserServiceImpl;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EnhanceAspect {
    @DeclareParents(value = "com.icypt.learn.service.UserService+", defaultImpl = EnhanceUserServiceImpl.class)
    public static EnhanceUserService enhanceUserService;

}
