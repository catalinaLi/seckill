package top.catalinali.seckill.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import top.catalinali.seckill.validator.IsMobile;

import javax.validation.constraints.NotNull;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 16:27 2019/3/21
 * @Modefied by:
 */
@Setter
@Getter
public class LoginVo {
    @NotNull
    @IsMobile
    private String mobile;

    @NotNull
    @Length(min=32)
    private String password;
}
