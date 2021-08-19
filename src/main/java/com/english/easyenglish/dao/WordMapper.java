package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Word;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Word
 */
@Mapper
public interface WordMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:59
     */
    int deleteByPrimaryKey(Long wordid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:59
     */
    int insert(Word record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:59
     */
    int insertSelective(Word record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:59
     */
    Word selectByPrimaryKey(Long wordid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:59
     */
    int updateByPrimaryKeySelective(Word record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:59
     */
    int updateByPrimaryKey(Word record);
}