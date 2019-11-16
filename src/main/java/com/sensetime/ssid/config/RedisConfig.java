package com.sensetime.ssid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

public class RedisConfig {
    /**
     * Jedis
     */
    @Bean
    public RedisConnectionFactory jedisConnectionFactory() {
        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
                .master("mymaster")
                .sentinel("redis-sentinel-1", 26579)
                .sentinel("redis-sentinel-2", 26579)
                .sentinel("redis-sentinel-3", 26579);
        return new JedisConnectionFactory(sentinelConfig);
    }

    /**
     * Lettuce
     */
    @Bean
    public RedisConnectionFactory lettuceConnectionFactory() {
        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
                .master("mymaster")
                .sentinel("redis-sentinel-1", 26579)
                .sentinel("redis-sentinel-2", 26579)
                .sentinel("redis-sentinel-3", 26579);

        return new LettuceConnectionFactory(sentinelConfig);
    }
}
