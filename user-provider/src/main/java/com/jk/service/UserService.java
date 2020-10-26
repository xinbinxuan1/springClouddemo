package com.jk.service;

import com.jk.entity.OrderEntity;
import com.jk.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findList();

    void deleteUser(Integer userId);

    void insertUser(UserEntity user);

    UserEntity huixian(Integer userId);
}
