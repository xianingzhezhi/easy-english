package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Collect;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Collect
 */
@Mapper
public interface CollectMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:12
     */
    int deleteByPrimaryKey(Long collectid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:12
     */
    int insert(Collect record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:12
     */
    int insertSelective(Collect record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:12
     */
    Collect selectByPrimaryKey(Long collectid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:12
     */
    int updateByPrimaryKeySelective(Collect record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:12
     */
    int updateByPrimaryKey(Collect record);
}