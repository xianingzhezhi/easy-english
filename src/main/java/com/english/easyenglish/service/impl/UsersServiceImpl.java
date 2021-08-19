package com.english.easyenglish.service.impl;

import com.english.easyenglish.dao.UsersMapper;
import com.english.easyenglish.pojo.Users;
import com.english.easyenglish.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users Login(String account, String password) {
        return usersMapper.getUserByAccountAndPassword(account, password);
    }
}
