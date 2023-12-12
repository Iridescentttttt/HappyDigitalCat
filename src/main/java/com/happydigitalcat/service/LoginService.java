package com.happydigitalcat.service;

import com.happydigitalcat.entity.User;

public interface LoginService {
    //    User login(String code);
    //    public WxSession getWxSessionByCode(String code);


    User login(User user);


    void register(User user);

    User getByPhoneNumber(User user);
}
