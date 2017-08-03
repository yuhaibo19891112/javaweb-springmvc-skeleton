package com.yuhaibo.web.index;

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
        return "jsp/index";
    }

}
