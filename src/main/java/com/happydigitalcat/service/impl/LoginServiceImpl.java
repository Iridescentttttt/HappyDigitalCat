package com.happydigitalcat.service.impl;

import com.happydigitalcat.entity.User;
import com.happydigitalcat.mapper.LoginMapper;
import com.happydigitalcat.mapper.UserMapper;
import com.happydigitalcat.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;
    @Override
    public User login(User user) {
        return loginMapper.getUserByPhonenumberAndPassword(user);
    }
    @Override
    public void register(User user) {
        user.setCreateTime(LocalDateTime.now());
        loginMapper.insert(user);
    }

    @Override
    public User getByPhoneNumber(User user) {
        return loginMapper.getUserByPhoneNumber(user);
    }

}
