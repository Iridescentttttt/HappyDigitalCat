package com.happydigitalcat.mapper;

import com.happydigitalcat.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {

    /**
     * 登录
     * @param user
     * @return
     */
    @Select("select * from user where phone_number = #{phoneNumber} and password = #{password}")
    User getUserByPhonenumberAndPassword(User user);

    /**
     * 注册
     * @param user
     */
    @Insert("insert into user(create_time, nickname, emergency_number , phone_number , password) " +
            " values(#{createTime},#{nickname},#{emergencyNumber},#{phoneNumber},#{password})")
    void insert(User user);

    /**
     * 根据用户电话号码查找用户
     * @param user
     * @return
     */
    @Select("select * from user where  phone_number = #{phoneNumber}")
    User getUserByPhoneNumber(User user);
}
