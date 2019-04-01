package top.catalinali.seckill.vo;

import top.catalinali.seckill.domain.MiaoshaUser;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:43 2019/4/1
 * @Modefied by:
 */
public class GoodsDetailVo {
    private int miaoshaStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods ;
    private MiaoshaUser user;
    public int getMiaoshaStatus() {
        return miaoshaStatus;
    }
    public void setMiaoshaStatus(int miaoshaStatus) {
        this.miaoshaStatus = miaoshaStatus;
    }
    public int getRemainSeconds() {
        return remainSeconds;
    }
    public void setRemainSeconds(int remainSeconds) {
        this.remainSeconds = remainSeconds;
    }
    public GoodsVo getGoods() {
        return goods;
    }
    public void setGoods(GoodsVo goods) {
        this.goods = goods;
    }
    public MiaoshaUser getUser() {
        return user;
    }
    public void setUser(MiaoshaUser user) {
        this.user = user;
    }
}
