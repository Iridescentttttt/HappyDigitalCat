package com.happydigitalcat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private Integer gender;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String nickname;
    private String avatar;
    private String emergencyNumber;
    private String phoneNumber;
    private String password;
    private String location;
    private LocalDate birthday;

    //wechat登录暂时不用
    private String sessionId;
    private String openId;
    private String unionId;
    private String sessionKey;
}
