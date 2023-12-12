package com.happydigitalcat;


import com.happydigitalcat.utils.JwtUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class HappydigitalcatApplicationTests {

    @Test
    void contextLoads() {
    }


    /**
     * 解析JWT
     */
//    @Test
//    public void testParseJwt(){
//        System.out.println(JwtUtils.parseJWT("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MSwiZXhwIjoxNzAxODMzMjAyfQ.fHhy0XDlBbe9zZb8NyqVZ_PsBYEtGJwvxpNUvQcWWQ0"));
//    }
}
