package com.icypt.learn.conditional;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/5 18:31
 * version：1.0
 * description：
 */
public class BlogBeanConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String [] defProfile = environment.getDefaultProfiles();
        for(String str : defProfile) {
            if(str.equals("test")) {
                return true;
            }
        }
        return false;
    }
}
