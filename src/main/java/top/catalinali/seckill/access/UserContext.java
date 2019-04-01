package top.catalinali.seckill.access;

import top.catalinali.seckill.domain.MiaoshaUser;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:27 2019/4/1
 * @Modefied by:
 */
public class UserContext {

    private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<MiaoshaUser>();

    public static void setUser(MiaoshaUser user) {
        userHolder.set(user);
    }

    public static MiaoshaUser getUser() {
        return userHolder.get();
    }

}

