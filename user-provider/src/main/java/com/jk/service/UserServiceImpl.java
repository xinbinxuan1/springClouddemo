package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.entity.UserEntity;
import com.jk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> findList() {
        return userMapper.findList();
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public void insertUser(UserEntity user) {
        if (user.getUserId()==null){
            userMapper.insertUser(user);
        }else {
            userMapper.updateUser(user);
        }
    }

    @Override
    public UserEntity huixian(Integer userId) {
        return userMapper.huixian(userId);
    }
}
