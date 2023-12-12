package com.happydigitalcat.mapper;

import com.happydigitalcat.entity.PsychologyQuestionnaire;
import com.happydigitalcat.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PsychologyMapper {
    @Select("select suggestion from suggestion where user_id = #{id}")
    String getSuggestion(User u);
    @Insert("insert into psychology_record(first, second, third , fourth , fifth, sixth, user_id)" +
             "values(#{first},#{second},#{third},#{fourth},#{fifth},#{sixth},#{id})")
    void insertPsychologyRecord(PsychologyQuestionnaire psychologyQuestionnaire);

    @Select("select * from psychology_record where user_id = #{id}")
    PsychologyQuestionnaire getPsychologyQuestionnaireById(PsychologyQuestionnaire psychologyQuestionnaire);

    @Update("update psychology_record set first=#{first}, second=#{second},third=#{third},fourth=#{fourth},fifth=#{fifth},sixth=#{sixth} where user_id=#{id}")
    void updatePsychologyRecord(PsychologyQuestionnaire psychologyQuestionnaire);
}
