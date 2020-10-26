package com.jk.mapper;

import com.jk.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<UserEntity> findList();

    void deleteUser(Integer userId);

    void insertUser(UserEntity user);

    UserEntity huixian(Integer userId);

    void updateUser(UserEntity user);
}
