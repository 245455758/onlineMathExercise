package com.trouble.math.dao;

import com.trouble.math.pojo.User;

import java.util.List;

public interface UserDao {

	User selectUserById(String id);
    List<User> selectUserList(User user);
    Integer selectUserListCount(User user);
    User getUserById(Integer id);

}
