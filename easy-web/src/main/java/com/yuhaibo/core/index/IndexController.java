package com.yuhaibo.core.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title:
 * @Description:
 * @Author: yuhaibo
 * @Since: 2017年08月03日
 * @Version: 1.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "home/index";
    }

    @RequestMapping("/index")
    public String index2() {
        return "home/index";
    }

}
