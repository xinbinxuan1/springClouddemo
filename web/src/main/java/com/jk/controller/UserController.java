package com.jk.controller;

import com.jk.entity.UserEntity;
import com.jk.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/show")
    public String show(){
        return userservice.show();
    }

    @RequestMapping("/findListOne")
    public List<UserEntity> findListOne(){
        return userservice.findListOne();
    }

    @RequestMapping("/deleteUser")
    public void deleteUser(Integer userId){
        userservice.deleteUser(userId);
    }

    @RequestMapping("/insertUser")
    public void insertUser(UserEntity user){
        userservice.insertUser(user);
    }

    @RequestMapping("/huixianOne")
    public UserEntity huixianOne(Integer userId){
        return userservice.huixianOne(userId);
    }
}
