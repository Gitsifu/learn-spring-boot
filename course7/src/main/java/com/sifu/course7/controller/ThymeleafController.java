package com.sifu.course7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author sifu
 * @version 1.0
 * @date 2018/9/20
 */
@Controller
@RequestMapping
public class ThymeleafController {

    @RequestMapping("/test404")
    public String test404() {
        return "index";
    }

    @RequestMapping("/test500")
    public String test500() {
        int i = 1 / 0;
        return "index";
    }
}
