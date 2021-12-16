package ua.org.arvmheritage.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;

@Configuration
public class DatabaseConnectionConfig {

    @Resource
    private Environment environment;

    @Bean
    public StringRedisTemplate redisTemplate(){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(jedisConnectionFactory);
        jedisConnectionFactory.afterPropertiesSet();
        return stringRedisTemplate;
    }

    @Bean
    public DriverManagerDataSource dataSource(){
        String mysqlUsername = redisTemplate().opsForValue()
                .get(environment.getProperty("spring.datasource.username"));
        String mysqlPassword = redisTemplate().opsForValue()
                .get(environment.getProperty("spring.datasource.password"));
        DriverManagerDataSource mysqlInstance = new DriverManagerDataSource();
        mysqlInstance.setDriverClassName(environment.getProperty("spring.datasource.driverClassName"));
        mysqlInstance.setUrl(environment.getProperty("spring.datasource.url"));
        mysqlInstance.setUsername(mysqlUsername);
        mysqlInstance.setPassword(mysqlPassword);
        return mysqlInstance;
    }
}