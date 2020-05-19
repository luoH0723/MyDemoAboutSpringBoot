package com.lhstudy.dao;

import com.lhstudy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    void saveUser(User user);
    User login(@Param("username") String username,@Param("password") String password);
}
