package com.sifu.course2.controller;

import com.sifu.course2.comm.JsonResult;
import com.sifu.course2.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sifu
 * @version 1.0
 * @date 2018/9/19
 */
@RestController
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User((long) 1, "sifu", "123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User((long) 1, "sifu", "123456");
        User user2 = new User((long) 2, "xiaoming", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User((long) 1, "倪升武", "123456");
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return new JsonResult<>(map);
    }

}
