package com.happydigitalcat.service.impl;

import com.happydigitalcat.entity.PsychologyQuestionnaire;
import com.happydigitalcat.entity.User;
import com.happydigitalcat.mapper.PsychologyMapper;
import com.happydigitalcat.service.PsychologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychologyServiceImpl implements PsychologyService {

    @Autowired
    private PsychologyMapper psychologyMapper;

    /**
     * 获取用户心理建议
     * @param u
     * @return
     */
    @Override
    public String getSuggestion(User u) {
        return psychologyMapper.getSuggestion(u);
    }

    /**
     * 用户提交心理问卷
     * @param psychologyQuestionnaire
     */
    @Override
    public void updatePsychologyRecord(PsychologyQuestionnaire psychologyQuestionnaire) {
        PsychologyQuestionnaire p=new PsychologyQuestionnaire();
        p=psychologyMapper.getPsychologyQuestionnaireById(psychologyQuestionnaire);
        if(p == null) {
            psychologyMapper.insertPsychologyRecord(psychologyQuestionnaire);
        }
        psychologyMapper.updatePsychologyRecord(psychologyQuestionnaire);
    }
}
