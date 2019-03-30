package com.icypt.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/30 13:32
 * version：1.0
 * description：
 */
@Configuration
@ComponentScan(basePackages ={"com.icypt.learn.service"} )
public class BaseConfiguration {
}
