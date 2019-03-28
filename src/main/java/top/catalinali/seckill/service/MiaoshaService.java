package top.catalinali.seckill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.catalinali.seckill.domain.MiaoshaUser;
import top.catalinali.seckill.domain.OrderInfo;
import top.catalinali.seckill.vo.GoodsVo;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:41 2019/3/27
 * @Modefied by:
 */
@Service
public class MiaoshaService {

    @Autowired
    GoodsService goodsService;

    @Autowired
    OrderService orderService;

    @Transactional
    public OrderInfo miaosha(MiaoshaUser user, GoodsVo goods) {
        //减库存 下订单 写入秒杀订单
        goodsService.reduceStock(goods);
        //order_info maiosha_order
        return orderService.createOrder(user, goods);
    }

}
