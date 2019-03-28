package top.catalinali.seckill.vo;

import lombok.Getter;
import lombok.Setter;
import top.catalinali.seckill.domain.Goods;

import java.util.Date;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:37 2019/3/27
 * @Modefied by:
 */
@Getter
@Setter
public class GoodsVo extends Goods {
    private Double miaoshaPrice;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}
