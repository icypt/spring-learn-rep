package com.icypt.learn;

import com.icypt.learn.configuration.BeanConfig;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/21 21:18
 * version：1.0
 * description：
 */
public class TestBeanScope {
    public static Logger logger = LoggerFactory.getLogger(TestBeanScope.class);
    public static AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(BeanConfig.class);

    @Test
    public void testPrototype() {
        BeanPrototypeScope beanPrototypeScope = acac.getBean("beanPrototypeScope", BeanPrototypeScope.class);
        logger.info("通过上下文获取时BeanPrototypeScope的实例是：{}",beanPrototypeScope.toString());
    }
}
