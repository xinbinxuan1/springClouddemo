package com.jk.service;

import com.jk.entity.UserEntity;
import com.jk.service.Hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user-provider",fallback = UserServiceHystrix.class)
public interface Userservice {

    @RequestMapping("/show")
    String show();

    @RequestMapping("/findListOne")
    public List<UserEntity> findListOne();

    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestParam Integer userId);

    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody UserEntity user);

    @RequestMapping("/huixianOne")
    public UserEntity huixianOne(@RequestParam Integer userId);
}
