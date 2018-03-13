package com.gasyz.common.redis;

import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by gaoang on 2018/3/12.
 */
@Component
public class RedisClient implements IRedis {

    private StringRedisTemplate stringRedisTemplate;

    public RedisClient(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }


    public String getString(String key) {
        return this.get(key);
    }

    public void setString(String key, String value) {
        this.set(key,value);
    }

    public void setString(String key, String value, long liveTime) {
        this.set(key,value,liveTime);
    }

    public <T> T getObject(String key, Class<T> clazz) {
        String text = this.get(key);
        return JSON.parseObject(text, clazz);
    }

    public <T> void setObject(String key, T obj) {
        this.set(key,JSON.toJSONString(obj));
    }

    public void delete(String key) {
        stringRedisTemplate.delete(key);
    }

    public void expire(String key, int liveTime) {
        this.stringRedisTemplate.expire(key,liveTime, TimeUnit.SECONDS);
    }

    public void expireAt(String key, Date data) {
        this.stringRedisTemplate.expireAt(key,data);
    }

    private void set(String key,String value,long liveTime) {
        stringRedisTemplate.opsForValue().set(key,value,liveTime);
    }

    private void set(String key,String value) {
        stringRedisTemplate.opsForValue().set(key,value);
    }

    private String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
