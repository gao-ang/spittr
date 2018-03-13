package com.gasyz;

import com.gasyz.config.RedisConfig;
import com.gasyz.config.RootConfig;
import com.gasyz.config.SpringDBConfig;
import com.gasyz.config.WebConfig;
import com.gasyz.spittr.service.SpitterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by gaoang on 2018/3/13.
 */
//指定测试类的运行者
@RunWith(SpringJUnit4ClassRunner.class)
//指定spring配置类
@ContextConfiguration(classes = {RootConfig.class, WebConfig.class, RedisConfig.class, SpringDBConfig.class})
@WebAppConfiguration
public class BaseTest {
    @Autowired
    private SpitterService spitterService;

    @Test
    public void test() {
        System.out.println("a");
    }
}
