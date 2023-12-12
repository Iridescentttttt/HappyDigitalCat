package com.happydigitalcat.controller;


import com.happydigitalcat.entity.Result;
import com.happydigitalcat.entity.User;
import com.happydigitalcat.entity.UserLogin;
import com.happydigitalcat.service.LoginService;
import com.happydigitalcat.service.UserService;
import com.happydigitalcat.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

//    @PostMapping("/login/{code}")
//    public Result login(@RequestBody String code){
//        log.info("用户登录: {}", code);
//        User u = userService.login(code);
//
//        //登录成功,生成令牌,下发令牌
//        if (u != null){
//            Map<String, Object> claims = new HashMap<>();
//            claims.put("id", u.getId());
//
//
//            String jwt = JwtUtils.generateJwt(claims); //jwt包含了当前登录的用户信息
//            return Result.success(jwt);
//        }
//
//        //登录失败, 返回错误信息
//        return Result.error("用户名或密码错误");
//    }

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        log.info("用户登录: {},{}", user.getPhoneNumber(),user.getPassword());
        User u = loginService.login(user);
        UserLogin ul=new UserLogin();
        //登录成功,生成令牌,下发令牌
        if (u != null){
            String jwt = JwtUtils.generateJwt(u.getId()); //jwt包含了当前登录的用户信息
            ul.setJwt(jwt);
            ul.setId(u.getId());
            return Result.success(ul);
        }

        //登录失败, 返回错误信息
        return Result.error("用户名或密码错误");
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        log.info("用户注册: {}",user);
        User u=loginService.getByPhoneNumber(user);
        if(u != null){
            log.info("已经注册过了");
            return Result.error("已经注册过了无需重复注册");
        }
        loginService.register(user);
        return Result.success();
    }
}
