package top.catalinali.seckill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catalinali.seckill.dao.GoodsDao;
import top.catalinali.seckill.domain.MiaoshaGoods;
import top.catalinali.seckill.vo.GoodsVo;

import java.util.List;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:41 2019/3/27
 * @Modefied by:
 */

@Service
public class GoodsService {

    @Autowired
    GoodsDao goodsDao;

    public List<GoodsVo> listGoodsVo(){
        return goodsDao.listGoodsVo();
    }

    public GoodsVo getGoodsVoByGoodsId(long goodsId) {
        return goodsDao.getGoodsVoByGoodsId(goodsId);
    }

    public void reduceStock(GoodsVo goods) {
        MiaoshaGoods g = new MiaoshaGoods();
        g.setGoodsId(goods.getId());
        goodsDao.reduceStock(g);
    }



}

