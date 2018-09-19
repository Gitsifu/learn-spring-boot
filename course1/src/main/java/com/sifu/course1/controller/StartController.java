package com.sifu.course1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sifu
 * @version 1.0
 * @date 2018/9/19
 */
@RestController
@RequestMapping("/start")
public class StartController {
    @RequestMapping("/springboot")
    public String startSpringBoot(){
        return "Welcome to the world of Spring Boot";
    }
}


