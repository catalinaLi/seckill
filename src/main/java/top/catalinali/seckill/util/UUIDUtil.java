package top.catalinali.seckill.util;

import java.util.UUID;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:09 2019/3/27
 * @Modefied by:
 */
public class UUIDUtil {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
