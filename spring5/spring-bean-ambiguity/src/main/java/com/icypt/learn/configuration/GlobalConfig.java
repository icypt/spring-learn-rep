package com.icypt.learn.configuration;

import com.icypt.learn.service.impl.FashionMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/20 11:02
 * version：1.0
 * description：
 */
@Configuration
@ComponentScan("com.icypt.learn")
public class GlobalConfig {

//    @Bean
//    @Primary
//    public FashionMusic fashionMusic() {
//        return new FashionMusic();
//    }
}
