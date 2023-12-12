package com.happydigitalcat.service;

import com.happydigitalcat.entity.PsychologyQuestionnaire;
import com.happydigitalcat.entity.User;

public interface PsychologyService {
    String getSuggestion(User u);

    void updatePsychologyRecord(PsychologyQuestionnaire psychologyQuestionnaire);
}
