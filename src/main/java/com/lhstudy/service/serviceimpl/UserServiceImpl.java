package com.lhstudy.service.serviceimpl;

import com.lhstudy.dao.UserDao;
import com.lhstudy.pojo.User;
import com.lhstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional//工厂管理
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.saveUser(user);
    }
}
