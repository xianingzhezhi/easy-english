package com.english.easyenglish.controller;

import com.english.easyenglish.common.JsonResult;
import com.english.easyenglish.pojo.Users;
import com.english.easyenglish.service.UsersService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UsersController {
    @Resource
    private UsersService usersService;

    @GetMapping("login")
    public JsonResult Login(String account,String password){
        Users login = usersService.Login(account, password);
        if(login == null){
            return new JsonResult(500,"账号或密码有误");
        }
        return new JsonResult<Users>("登录成功",login);
    }
}
