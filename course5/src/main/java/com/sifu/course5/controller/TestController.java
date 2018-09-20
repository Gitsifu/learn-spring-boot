package com.sifu.course5.controller;

import com.sifu.course5.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author sifu
 * @version 1.0
 * @date 2018/9/20
 */
@RestController
public class TestController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet() {
        return "success";
    }

    @GetMapping("/user/{id}")
    public String test1PathVariable(@PathVariable Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    @RequestMapping("/user/{idd}")
    public String test2PathVariable(@PathVariable(value = "idd") Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    @GetMapping("/user/{idd}/{name}")
    public String test3PathVariable(@PathVariable(value = "idd") Integer id, @PathVariable String name) {
        System.out.println("获取到的id为：" + id);
        System.out.println("获取到的name为：" + name);
        return "success";
    }

    @GetMapping("/user")
    public String test1RequestParam(@RequestParam Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    @RequestMapping("/user")
    public String test2RequestParam(@RequestParam(value = "idd", required = false) Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    /**
     * @RequestParam 注解用于 GET 请求上时，接收拼接在 URL 中的参数。除此之外，该注解还可以用于 POST 请求，接收前端表单提交的参数，假如前端通过表单提交 username 和 password 两个参数，那我们可以使用 @RequestParam 来接收，用法和上面一样。
     */
    @PostMapping("/form1")
    public String testForm(@RequestParam String username, @RequestParam String password) {
        System.out.println("获取到的username为：" + username);
        System.out.println("获取到的password为：" + password);
        return "success";
    }

    @PostMapping("/form2")
    public String testForm(User user) {
        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }

    @PostMapping("/user")
    public String testRequestBody(@RequestBody User user) {
        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }
}
