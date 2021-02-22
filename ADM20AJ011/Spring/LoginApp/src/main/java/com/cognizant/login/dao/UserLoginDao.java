package com.cognizant.login.dao;

import com.cognizant.login.entity.User;

public interface UserLoginDao {
 public boolean checkUserWithPassword(User user) throws Exception;
}
