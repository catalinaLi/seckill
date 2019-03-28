package top.catalinali.seckill.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:38 2019/3/27
 * @Modefied by:
 */
@Setter
@Getter
public class MiaoshaGoods {
    private Long id;
    private Long goodsId;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}
