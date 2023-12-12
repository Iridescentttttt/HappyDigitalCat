package com.happydigitalcat.mapper;


import com.happydigitalcat.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
//    @Select("select * from user where open_id = #{open_id}")
//    User getByOpenId(User user) ;

//    @Select("SELECT * FROM user")
//    List<User> getUserList();
//
//    @Select("SELECT * FROM user WHERE openId=#{openId};")
//    User getUserByOpenId(@Param("openId")String openId);



    @Select("select * from user where  id = #{id}")
    User getUserById(User user);



    @Select("select count(*) from user")
    Long count();


    void updateInfo(User user);
}
