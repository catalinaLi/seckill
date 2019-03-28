package top.catalinali.seckill.redis;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:51 2019/3/22
 * @Modefied by:
 */
public interface KeyPrefix {

    int expireSeconds();

    String getPrefix();
}
