package top.catalinali.seckill.vo;

import lombok.Getter;
import lombok.Setter;
import top.catalinali.seckill.domain.OrderInfo;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:43 2019/4/1
 * @Modefied by:
 */
@Setter
@Getter
public class OrderDetailVo {
    private GoodsVo goods;
    private OrderInfo order;
}
