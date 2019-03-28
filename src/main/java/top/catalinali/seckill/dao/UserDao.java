package top.catalinali.seckill.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.catalinali.seckill.domain.User;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:32 2019/3/21
 * @Modefied by:
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    public User getById(@Param("id")int id	);

    @Insert("insert into user(id, name)values(#{id}, #{name})")
    public int insert(User user);

}

