package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Answer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Answer
 */
@Mapper
public interface AnswerMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:55:48
     */
    int deleteByPrimaryKey(Long answerid);

    /**
     *
     * @mbg.generated 2021-08-18 13:55:48
     */
    int insert(Answer record);

    /**
     *
     * @mbg.generated 2021-08-18 13:55:48
     */
    int insertSelective(Answer record);

    /**
     *
     * @mbg.generated 2021-08-18 13:55:48
     */
    Answer selectByPrimaryKey(Long answerid);

    /**
     *
     * @mbg.generated 2021-08-18 13:55:48
     */
    int updateByPrimaryKeySelective(Answer record);

    /**
     *
     * @mbg.generated 2021-08-18 13:55:48
     */
    int updateByPrimaryKey(Answer record);
}