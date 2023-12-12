package com.happydigitalcat.controller;


import com.happydigitalcat.entity.Result;
import com.happydigitalcat.entity.User;
import com.happydigitalcat.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userservice;

    /**
     * 获取用户个人信息
     * @param id
     * @return
     */
    @GetMapping("/profile/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据ID查询信息, id: {}",id);
        User u=new User();
        u.setId(id);
        User emp = userservice.getById(u);
        return Result.success(emp);
    }

    /**
     * 修改用户个人信息
     * @param user
     * @return
     */
    @PutMapping("/profile")
    public Result UpdateInfo(@RequestBody User user){
        log.info("修改用户信息，用户为{}",user);
        userservice.updateInfo(user);
        return Result.success();
    }
}
