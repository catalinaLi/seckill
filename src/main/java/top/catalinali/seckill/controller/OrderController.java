package top.catalinali.seckill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.catalinali.seckill.domain.MiaoshaUser;
import top.catalinali.seckill.domain.OrderInfo;
import top.catalinali.seckill.redis.RedisService;
import top.catalinali.seckill.result.CodeMsg;
import top.catalinali.seckill.result.Result;
import top.catalinali.seckill.service.GoodsService;
import top.catalinali.seckill.service.MiaoshaUserService;
import top.catalinali.seckill.service.OrderService;
import top.catalinali.seckill.vo.GoodsVo;
import top.catalinali.seckill.vo.OrderDetailVo;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:30 2019/4/1
 * @Modefied by:
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    OrderService orderService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetailVo> info(Model model, MiaoshaUser user,
                                      @RequestParam("orderId") long orderId) {
        if(user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo order = orderService.getOrderById(orderId);
        if(order == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }
        long goodsId = order.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        OrderDetailVo vo = new OrderDetailVo();
        vo.setOrder(order);
        vo.setGoods(goods);
        return Result.success(vo);
    }

}
