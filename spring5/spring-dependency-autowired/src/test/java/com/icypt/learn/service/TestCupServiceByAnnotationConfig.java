package com.icypt.learn.service;

import com.icypt.learn.config.BasePackageClassesConfig;
import com.icypt.learn.service.impl.ColaCupServiceImpl;
import com.icypt.learn.service.impl.JavaAnnotationManServiceImpl;
import com.icypt.learn.service.impl.ManServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/3/30 13:48
 * version：1.0
 * description：
 */
public class TestCupServiceByAnnotationConfig {
    public AnnotationConfigApplicationContext  getAcac() {
        //基于注解配置加载Spring应用上下文
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(BasePackageClassesConfig.class);
        return acac;
    }

    @Test
    public void testColaService() {
        ColaCupServiceImpl ccs = getAcac().getBean("colaCupServiceImpl", ColaCupServiceImpl.class);
        ccs.drink();
    }

    @Test
    public void testManDrinkService() {
        PersonService ms = getAcac().getBean("manServiceImpl", ManServiceImpl.class);
        ms.drink();
    }

    @Test
    public void testJavaAnnotaionManDrinkService() {
        PersonService ms = getAcac().getBean("javaAnnotationManServiceImpl", JavaAnnotationManServiceImpl.class);
        ms.drink();
    }
}
