package com.happydigitalcat.service.impl;

import com.happydigitalcat.entity.Chat;
import com.happydigitalcat.entity.Message;
import com.happydigitalcat.mapper.ChatMapper;
import com.happydigitalcat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatMapper chatMapper;

    /**
     * 创建chat会话
     * @param chat
     */
    @Override
    public void createChat(Chat chat) {
        chatMapper.createChat(chat);
    }

    @Override
    public void addMessage(Message m) {
        chatMapper.addMessage(m);
    }
}
