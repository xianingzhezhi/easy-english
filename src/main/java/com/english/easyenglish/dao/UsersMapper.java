package com.english.easyenglish.dao;

import com.english.easyenglish.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.english.easyenglish.pojo.Users
 */
@Mapper
public interface UsersMapper {
    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    int deleteByPrimaryKey(Long userid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    int insert(Users record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    int insertSelective(Users record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    Users selectByPrimaryKey(Long userid);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     *
     * @mbg.generated 2021-08-18 13:56:50
     */
    int updateByPrimaryKey(Users record);

    /**
     * 登录验证
     * @param account
     * @param password
     * @return
     */
    Users getUserByAccountAndPassword(String account,String password);
}