package com.happydigitalcat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    private Integer id;
    private Integer userId;
    private LocalDateTime createTime;
}
