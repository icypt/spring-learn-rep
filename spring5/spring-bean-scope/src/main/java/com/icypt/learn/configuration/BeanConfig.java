package com.icypt.learn.configuration;

import com.icypt.learn.BeanPrototypeScope;
import com.icypt.learn.ShoppingCar;
import com.icypt.learn.UseProtoBean;
import com.icypt.learn.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/21 21:16
 * version：1.0
 * description：
 */
@Configuration
public class BeanConfig {
    public static Logger logger = LoggerFactory.getLogger(BeanConfig.class);

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public BeanPrototypeScope beanPrototypeScope() {
        return new BeanPrototypeScope();
    }

    @Bean
    public UseProtoBean useProtoBean(BeanPrototypeScope beanPrototypeScope) {
        logger.info("注入时BeanPrototypeScope的实例是：{}",beanPrototypeScope.toString());
        return new UseProtoBean(beanPrototypeScope);
    }

//    @Bean
//    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
//    public ShoppingCar shoppingCar() {
//        return new ShoppingCar();
//    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public ShoppingCar shoppingCar() {
        return new ShoppingCar();
    }

    @Bean
    public User user(ShoppingCar shoppingCar) {
        return new User(shoppingCar);
    }
}
