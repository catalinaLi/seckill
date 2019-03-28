package top.catalinali.seckill.redis;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:15 2019/3/22
 * @Modefied by:
 */

@Component
@ConfigurationProperties(prefix="spring.redis")
@Getter
@Setter
public class RedisConfig {
    private String host;
    private int port;
    private int timeout;//秒
    private String password;
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWait;//秒
}
