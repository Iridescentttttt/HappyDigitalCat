package com.happydigitalcat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//用户登录时返回给前端用户id和jwt令牌
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {
    private Integer id;
    private String jwt;
}
