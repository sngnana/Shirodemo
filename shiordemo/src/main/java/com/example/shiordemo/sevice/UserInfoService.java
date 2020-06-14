package com.example.shiordemo.sevice;


import com.example.shiordemo.model.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}