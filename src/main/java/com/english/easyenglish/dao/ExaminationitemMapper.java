package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Examinationitem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Examinationitem
 */
@Mapper
public interface ExaminationitemMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:43
     */
    int deleteByPrimaryKey(Long examinationitemid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:43
     */
    int insert(Examinationitem record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:43
     */
    int insertSelective(Examinationitem record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:43
     */
    Examinationitem selectByPrimaryKey(Long examinationitemid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:43
     */
    int updateByPrimaryKeySelective(Examinationitem record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:43
     */
    int updateByPrimaryKey(Examinationitem record);
}