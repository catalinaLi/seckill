package top.catalinali.seckill.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:38 2019/3/27
 * @Modefied by:
 */
@Getter
@Setter
public class Goods {
    private Long id;
    private String goodsName;
    private String goodsTitle;
    private String goodsImg;
    private String goodsDetail;
    private Double goodsPrice;
    private Integer goodsStock;
}
