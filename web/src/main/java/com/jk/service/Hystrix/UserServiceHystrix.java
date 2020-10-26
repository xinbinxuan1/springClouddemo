package com.jk.service.Hystrix;

import com.jk.entity.UserEntity;
import com.jk.service.Userservice;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceHystrix implements Userservice {
    @Override
    public String show() {
        return "页面找不到了!!!";
    }

    @Override
    public List<UserEntity> findListOne() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public void insertUser(UserEntity user) {

    }

    @Override
    public UserEntity huixianOne(Integer userId) {
        return null;
    }
}
