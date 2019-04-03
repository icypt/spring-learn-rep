package com.icypt.learn.configuation;

import com.icypt.learn.service.Blog;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/3 22:17
 * version：1.0
 * description：
 */
@Configuration
@Import({UserConfig.class, MovieConfig.class, BlogConfig.class})
public class EntranceConfig {
}
