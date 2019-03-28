package top.catalinali.seckill.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:39 2019/3/27
 * @Modefied by:
 */
@Setter
@Getter
public class OrderInfo {
    private Long id;
    private Long userId;
    private Long goodsId;
    private Long  deliveryAddrId;
    private String goodsName;
    private Integer goodsCount;
    private Double goodsPrice;
    private Integer orderChannel;
    private Integer status;
    private Date createDate;
    private Date payDate;
}
