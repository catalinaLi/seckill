package top.catalinali.seckill.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:07 2019/3/27
 * @Modefied by:
 */
@Getter
@Setter
public class MiaoshaUser {
    private Long id;
    private String nickname;
    private String password;
    private String salt;
    private String head;
    private Date registerDate;
    private Date lastLoginDate;
    private Integer loginCount;
}
