package com.happydigitalcat.service;

import com.happydigitalcat.entity.Chat;
import com.happydigitalcat.entity.Message;

public interface ChatService {
    void createChat(Chat chat);

    void addMessage(Message m);
}
