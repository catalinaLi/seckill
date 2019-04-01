package top.catalinali.seckill.redis;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:52 2019/3/22
 * @Modefied by:
 */
public class OrderKey extends BasePrefix {

    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");

}
