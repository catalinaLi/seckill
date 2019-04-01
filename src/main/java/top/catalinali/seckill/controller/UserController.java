package top.catalinali.seckill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.catalinali.seckill.domain.MiaoshaUser;
import top.catalinali.seckill.redis.RedisService;
import top.catalinali.seckill.result.Result;
import top.catalinali.seckill.service.MiaoshaUserService;

/**
 * @Author: lllx
 * @Description:
 * @Date: Created on 15:31 2019/4/1
 * @Modefied by:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> info(Model model, MiaoshaUser user) {
        return Result.success(user);
    }

}
