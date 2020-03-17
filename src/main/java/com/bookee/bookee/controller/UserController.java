package com.bookee.bookee.controller;

import com.bookee.bookee.entity.UserEo;
import com.bookee.bookee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/system/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("selectOne")
    public List<UserEo> selectOne(UserEo userEo){
        return userService.selectOne(userEo);
    }
}
