package com.yuhaibo.admin.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月25日
 * @Version: 1.0
 */
@Controller
@RequestMapping
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "home/index";
    }
}
