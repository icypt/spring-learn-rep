package com.icypt.learn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 19:58
 * version：1.0
 * description：
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LogAnnotationParam {
}
