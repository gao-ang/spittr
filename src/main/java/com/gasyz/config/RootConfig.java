package com.gasyz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by gaoang on 2018/2/26.
 */
@Configuration
@Import({RedisConfig.class,SpringDBConfig.class,WebConfig.class})
//在WebConfig里只设置一个
// @ComponentScan(basePackages = {"gasyz.*"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {

}
