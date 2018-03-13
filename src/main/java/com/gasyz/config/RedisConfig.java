package com.gasyz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by gaoang on 2018/3/12.
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisStandaloneConfiguration redisStandaloneConfiguration() {
        //新的redis设置HostName和Password的方法，以前的过期了
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName("115.159.0.122");
        redisStandaloneConfiguration.setPassword(RedisPassword.of("VGx9BTPHfZwHN3Ci9lOk"));
        redisStandaloneConfiguration.setPort(6379);
        return redisStandaloneConfiguration;
    }

    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(100);//最大连接数,默认8个
        jedisPoolConfig.setMaxIdle(100);//最大空闲连接数,默认8个
        jedisPoolConfig.setMinIdle(10);//最小空闲连接数, 默认0
        //获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1
        jedisPoolConfig.setMaxWaitMillis(10000);
        jedisPoolConfig.setTestOnBorrow(true);//在获取连接的时候检查有效性, 默认false
        jedisPoolConfig.setTestOnReturn(true);//在空闲时检查有效性, 默认false
        return jedisPoolConfig;
    }

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(redisStandaloneConfiguration());
        jedisConnectionFactory.setPoolConfig(jedisPoolConfig());
        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {//需要加入扫描的包，才能用构造器自动注入
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }

    /**
     * value和key都是String类型
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        return new StringRedisTemplate(redisConnectionFactory);
    }

/*    @Bean
    public RedisClient redisClient(StringRedisTemplate stringRedisTemplate) {
        return new RedisClient(stringRedisTemplate);
    }*/

}
