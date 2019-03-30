package com.icypt.learn.config;

import com.icypt.learn.service.impl.MarkBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/30 14:19
 * version：1.0
 * description：
 */
@Configuration
@ComponentScan(basePackageClasses = {MarkBean.class})
public class BasePackageClassesConfig {
}
