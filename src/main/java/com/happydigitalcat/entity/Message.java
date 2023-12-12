package com.happydigitalcat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private Integer id;//前端穿过来的
    private String content;
    private LocalDateTime createTime;
    private Integer role;
    private Integer chatId;
}
