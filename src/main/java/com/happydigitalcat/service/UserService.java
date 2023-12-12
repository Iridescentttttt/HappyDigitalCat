package com.happydigitalcat.service;


import com.happydigitalcat.entity.User;

public interface UserService {

    User getById(User user);



    //获取用户总数
    Long count();

    void updateInfo(User user);
}
