package com.lhstudy.service;

import com.lhstudy.pojo.User;

public interface UserService {
    void register(User user);
    User login(String username,String password);
}
