package top.catalinali.seckill.rabbitmq;

import top.catalinali.seckill.domain.MiaoshaUser;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:33 2019/4/1
 * @Modefied by:
 */
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
    public MiaoshaUser getUser() {
        return user;
    }
    public void setUser(MiaoshaUser user) {
        this.user = user;
    }
    public long getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
