package com.happydigitalcat.controller;


import com.happydigitalcat.entity.Psychology;
import com.happydigitalcat.entity.PsychologyQuestionnaire;
import com.happydigitalcat.entity.Result;
import com.happydigitalcat.entity.User;
import com.happydigitalcat.service.PsychologyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class PsychologyController {
    @Autowired
    private PsychologyService psychologyService;

    /**
     * 查询用户心里建议
     * @param id
     * @return
     */
    @GetMapping("/physho/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据ID查询心理建议, id: {}",id);
        User u=new User();
        u.setId(id);
        Psychology psychology=new Psychology(psychologyService.getSuggestion(u));
        return Result.success(psychology);
    }

    /**
     * 用户提交心理问卷
     * @param psychologyQuestionnaire
     * @return
     */
    @PostMapping("/physho/information")
    public Result updatePsychologyRecord(@RequestBody PsychologyQuestionnaire psychologyQuestionnaire){
        log.info("根据ID提交用户心理档案,  {}",psychologyQuestionnaire);
        List<Integer> li=psychologyQuestionnaire.getQuestion();
        psychologyQuestionnaire.setFirst(li.get(0));
        psychologyQuestionnaire.setSecond(li.get(1));
        psychologyQuestionnaire.setThird(li.get(2));
        psychologyQuestionnaire.setFourth(li.get(3));
        psychologyQuestionnaire.setFifth(li.get(4));
        psychologyQuestionnaire.setSixth(li.get(5));
        psychologyService.updatePsychologyRecord(psychologyQuestionnaire);
        return Result.success();
    }


}
