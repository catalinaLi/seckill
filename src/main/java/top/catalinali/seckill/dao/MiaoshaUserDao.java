package top.catalinali.seckill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.catalinali.seckill.domain.MiaoshaUser;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:07 2019/3/27
 * @Modefied by:
 */
@Mapper
public interface MiaoshaUserDao {

    @Select("select * from miaosha_user where id = #{id}")
    public MiaoshaUser getById(@Param("id")long id);
}

