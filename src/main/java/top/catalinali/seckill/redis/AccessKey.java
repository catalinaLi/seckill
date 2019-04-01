package top.catalinali.seckill.redis;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:36 2019/4/1
 * @Modefied by:
 */
public class AccessKey extends BasePrefix{

    private AccessKey( int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static AccessKey withExpire(int expireSeconds) {
        return new AccessKey(expireSeconds, "access");
    }

}
