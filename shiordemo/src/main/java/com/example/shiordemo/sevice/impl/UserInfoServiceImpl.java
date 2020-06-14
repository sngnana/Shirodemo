package com.example.shiordemo.sevice.impl;

import com.example.shiordemo.dao.UserInfoDao;
import com.example.shiordemo.model.UserInfo;
import com.example.shiordemo.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}