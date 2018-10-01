package com.trouble.math.service.impl;

import com.trouble.math.dao.UserDao;
import com.trouble.math.pojo.QueryVo;
import com.trouble.math.pojo.User;
import com.trouble.math.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findUserById(String id){
    	User user = userDao.selectUserById(id);
        return user;
    }
}
