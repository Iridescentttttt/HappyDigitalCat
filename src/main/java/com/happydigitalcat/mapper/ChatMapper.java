package com.happydigitalcat.mapper;

import com.happydigitalcat.entity.Chat;
import com.happydigitalcat.entity.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ChatMapper {
    /**
     * 创建一个chat会话
     * @param chat
     */
    @Insert("insert into chat(user_id,create_time) values (#{userId} , #{createTime})")
    void createChat(Chat chat);

    /**
     * 新建一条消息
     * @param m
     */
    @Insert("insert into message(content,create_time,role,chat_id) values (#{content} , #{createTime},#{role},#{chatId})")
    void addMessage(Message m);
}
