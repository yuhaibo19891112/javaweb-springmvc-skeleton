package com.yuhaibo.web.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easy.dal.user.model.User;
import com.yuhaibo.core.user.service.UserService;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月03日
 * @Version: 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        User user = userService.getUserById(1);
        return "home/index";
    }

    @RequestMapping("/index")
    public String index2() {
        return "home/index";
    }

}
