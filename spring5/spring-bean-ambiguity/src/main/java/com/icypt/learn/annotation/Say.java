package com.icypt.learn.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/20 14:32
 * version：1.0
 * description：
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Say {
}
