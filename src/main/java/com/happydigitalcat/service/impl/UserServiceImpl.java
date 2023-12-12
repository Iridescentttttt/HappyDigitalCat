package com.happydigitalcat.service.impl;


import com.happydigitalcat.entity.User;
import com.happydigitalcat.mapper.UserMapper;
import com.happydigitalcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户信息
     * @param user
     * @return
     */
    @Override
    public User getById(User user) {
        return userMapper.getUserById(user);
    }


    @Override
    public Long count(){
        return userMapper.count();
    }

    /**
     * 更新用户信息
     * @param user
     */
    @Override
    public void updateInfo(User user) {
        userMapper.updateInfo(user);
    }

//    @Autowired
//    private SessionUtils sessionUtils;
//    @Override
//    public User login(String code) {
////        if (CommonConstants.SHADOW_TEST.equals(code)) {
////            sessionUtils.setSessionId(CommonConstants.SHADOW_TEST);
////            return new SessionData();
////        }
//
////        WxSession wxSession = Optional.ofNullable(
////                        getWxSessionByCode(code))
////                .orElse(new WxSession());
////
////        checkWxSession(wxSession);
//
//        String sessionId = sessionUtils.generateSessionId();
//        //根据openid查询DB
//        User user = userMapper.getUserByOpenId(wxSession.getOpenId());
//        //如果用户已注册，则返回用户
//        if (user != null) {
//            sessionUtils.setSessionId(user.getSessionId());
//            return new SessionData(user);
//        }
//        //如果未注册，则将用户信息存入DB
//        User newUser = User.builder()
//                .sessionId(sessionId)
//                .openId(wxSession.getOpenId())
//                .unionId(wxSession.getUnionId())
//                .sessionKey(wxSession.getSessionKey())
//                .nickname("Tarot用户")
//                .build();
//
//        userMapper.insert(newUser);
//
//        return new SessionData(newUser);
//        return userMapper.getByOpenId(user);
//    }
//    @Override
//    public WxSession getWxSessionByCode(String code) {
//        Map<String, String> requestUrlParam = new HashMap<>();
//        //小程序appId
////        requestUrlParam.put("appid", ymlConfig.getAppId());
////        requestUrlParam.put("appid", "wx22fa1182d4e66c4a");
//        //小程序secret
////        requestUrlParam.put("secret", ymlConfig.getAppSecret());
////        requestUrlParam.put("secret", "200e82982f7ec2a2812fc3ae9f2d5f15");
//        //小程序端返回的code
//        requestUrlParam.put("js_code", code);
//        //默认参数：授权类型
//        requestUrlParam.put("grant_type", "authorization_code");
//        //发送post请求读取调用微信接口获取openid用户唯一标识
//        String result = HttpUtil.get(CommonConstants.WX_SESSION_REQUEST_URL, requestUrlParam);
////        String result = HttpUtil.get("https://api.weixin.qq.com/sns/jscode2session", requestUrlParam);
//
//        return JsonUtil.toObject(result, WxSession.class);
//    }


}
