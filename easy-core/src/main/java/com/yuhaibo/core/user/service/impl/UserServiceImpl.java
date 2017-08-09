package com.yuhaibo.core.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy.dal.user.UserDao;
import com.yuhaibo.core.user.model.User;
import com.yuhaibo.core.user.service.UserService;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月09日
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User getUserById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
