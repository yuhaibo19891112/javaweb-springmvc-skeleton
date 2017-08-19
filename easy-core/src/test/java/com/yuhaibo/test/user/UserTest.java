package com.yuhaibo.test.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yuhaibo.core.user.service.UserService;
import com.yuhaibo.test.base.BaseJunit4Test;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月19日
 * @Version: 1.0
 */
public class UserTest extends BaseJunit4Test {
    @Autowired
    private UserService userService;

    @Test
    public void userTest() {
        //User user = userDao.selectByPrimaryKey(1);
        //System.out.println("---------------->" + user.getUserName());
    }
}
