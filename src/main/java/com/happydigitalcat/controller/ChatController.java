package com.happydigitalcat.controller;

import com.happydigitalcat.entity.*;
import com.happydigitalcat.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class ChatController {
    @Autowired
    private ChatService chatService;

    /**
     * 新建一个chat，注意此处传进来的id是chat表中的user_id
     *
     * @param id
     * @return
     */
    @PostMapping("/chat")
    public Result createChat(@RequestBody ChatInteger id) {
        log.info("根据ID新建chat, 用户id: {}", id);
        Chat c = new Chat();
        c.setUserId(id.getId());
        c.setCreateTime(LocalDateTime.now());
        chatService.createChat(c);
        return Result.success();
    }

    /**
     * 添加一条消息
     *
     * @param m
     * @return
     */
    @PostMapping("/message")
    public Result addMessage(@RequestBody Message m) {
        log.info("消息: {}", m);
        m.setCreateTime(LocalDateTime.now());
        m.setChatId(m.getId());
        chatService.addMessage(m);
        return Result.success();
    }

}
