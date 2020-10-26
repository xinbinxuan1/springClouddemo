package com.jk.controller;

import com.jk.entity.OrderEntity;
import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findListOne")
    public List<UserEntity> findListOne(){
        return userService.findList();
    }

    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestParam Integer userId){
        userService.deleteUser(userId);
    }

    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody UserEntity user){
        userService.insertUser(user);
    }

    @RequestMapping("/huixianOne")
    public UserEntity huixianOne(@RequestParam Integer userId){
        return userService.huixian(userId);
    }
}
