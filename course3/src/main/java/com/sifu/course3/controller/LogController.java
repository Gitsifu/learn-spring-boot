package com.sifu.course3.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
/**
 * @author sifu
 * @version 1.0
 * @date 2018/9/19
 */
@RestController
public class LogController {
    private final static  Logger log = LoggerFactory.getLogger(LogController.class);
    @RequestMapping("/log")
    public String testLog() {
        log.debug("=====测试日志debug级别打印====");
        log.info("======测试日志info级别打印=====");
        log.error("=====测试日志error级别打印====");
        log.warn("======测试日志warn级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_15";
        log.info("======倪升武的个人博客：{}；倪升武的CSDN博客：{}", str1, str2);

        return "success";
    }
}
