package com.gasyz.spitter.service;

import com.gasyz.SpringContextTestngTest;
import com.gasyz.SpringTransactionContextTestngTest;
import com.gasyz.common.redis.RedisClient;
import com.gasyz.spittr.service.SpitterService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by gaoang on 2018/3/13.
 */
public class SpitterServiceTest extends SpringContextTestngTest {
    @Autowired
    private SpitterService spitterService;

    @Resource
    private RedisClient redisClient;

    @Test
    public void testRedis() {
        redisClient.setString("a","测试1");
        String a = redisClient.getString("a");
        System.out.println(a);
    }
}
