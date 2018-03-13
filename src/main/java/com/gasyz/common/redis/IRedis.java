package com.gasyz.common.redis;

import java.util.Date;

/**
 * Created by gaoang on 2018/3/12.
 */
public interface IRedis {
    String getString(String key);

    void setString(String key, String value);

    void setString(String key, String value, long liveTime);

    <T> T getObject(String key, Class<T> clazz);

    <T> void setObject(String key, T obj);

    void delete(String key);

    void expire(String var1, int var2);

    void expireAt(String key, Date data);

}
