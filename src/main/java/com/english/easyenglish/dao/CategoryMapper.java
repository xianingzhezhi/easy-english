package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Category
 */
@Mapper
public interface CategoryMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:03
     */
    int deleteByPrimaryKey(Long categoryid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:03
     */
    int insert(Category record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:03
     */
    int insertSelective(Category record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:03
     */
    Category selectByPrimaryKey(Long categoryid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:03
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:03
     */
    int updateByPrimaryKey(Category record);
}