package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Errors;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Errors
 */
@Mapper
public interface ErrorsMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:21
     */
    int deleteByPrimaryKey(Long errorsid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:21
     */
    int insert(Errors record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:21
     */
    int insertSelective(Errors record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:21
     */
    Errors selectByPrimaryKey(Long errorsid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:21
     */
    int updateByPrimaryKeySelective(Errors record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:21
     */
    int updateByPrimaryKey(Errors record);
}