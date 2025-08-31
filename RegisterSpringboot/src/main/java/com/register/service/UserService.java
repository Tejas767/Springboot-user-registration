package com.register.service;


import com.register.entities.User;

public interface UserService {
  public boolean registeruser(User user);
  public User loginUser(String email,String password);
  
}
