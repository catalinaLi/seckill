package top.catalinali.seckill.redis;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:37 2019/4/1
 * @Modefied by:
 */
public class MiaoshaKey extends BasePrefix{

    private MiaoshaKey( int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static MiaoshaKey isGoodsOver = new MiaoshaKey(0, "go");
    public static MiaoshaKey getMiaoshaPath = new MiaoshaKey(60, "mp");
    public static MiaoshaKey getMiaoshaVerifyCode = new MiaoshaKey(300, "vc");
}
