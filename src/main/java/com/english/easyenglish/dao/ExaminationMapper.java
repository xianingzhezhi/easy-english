package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Examination;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Examination
 */
@Mapper
public interface ExaminationMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:32
     */
    int deleteByPrimaryKey(Long examinationid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:32
     */
    int insert(Examination record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:32
     */
    int insertSelective(Examination record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:32
     */
    Examination selectByPrimaryKey(Long examinationid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:32
     */
    int updateByPrimaryKeySelective(Examination record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:32
     */
    int updateByPrimaryKey(Examination record);
}