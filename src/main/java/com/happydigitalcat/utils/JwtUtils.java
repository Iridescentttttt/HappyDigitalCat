package com.happydigitalcat.utils;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {

    private static String signKey = "happycat";
    private static Long expire = 43200000L;

    /**
     * 生成JWT令牌
     * @param id JWT第二部分负载 payload 中存储的内容：用户的id
     * @return
     */
    public static String generateJwt(Integer id){
        Date date =new Date(System.currentTimeMillis()+expire);
        Algorithm algorithm=Algorithm.HMAC256(signKey);
        HashMap<String,Object> header=new HashMap<>();
        header.put("typ","JWT");
        header.put("alg","hs256");
        String jwt = JWT.create().withHeader(header).withExpiresAt(date).withClaim("id",id).sign(algorithm);
        return jwt;
    }

    /**
     * 解析JWT令牌
     * @param token 前端传来的令牌
     * @return JWT第二部分负载 payload 中存储的内容
     */
    public static Integer parseJWT(String token){
        DecodedJWT decode=JWT.decode(token);
        Claim id=decode.getClaim("id");
        Integer s=id.asInt();
        return s;
    }
}
