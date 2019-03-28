package top.catalinali.seckill.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:39 2019/3/27
 * @Modefied by:
 */
@Setter
@Getter
public class MiaoshaOrder {
    private Long id;
    private Long userId;
    private Long  orderId;
    private Long goodsId;
}
