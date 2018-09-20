package com.sifu.course6.controller;

import com.sifu.course6.comm.JsonResult;
import com.sifu.course6.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * -- @Api 注解用于类上，表示标识这个类是 Swagger 的资源。
 * -- @ApiOperation 注解用于方法，表示一个 HTTP 请求的操作。
 * -- @ApiParam 注解用于参数上，用来标明参数信息。
 * @author sifu
 * @version 1.0
 * @date 2018/9/20
 */
@RestController
@RequestMapping("/swagger")
@Api(value = "Swagger2在线接口文档")
public class TestController {

    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult<User> getUserInfo(
            @PathVariable
            @ApiParam(value = "用户唯一标识") Long id) {
        User user = new User(id, "sifu", "123555");
        return new JsonResult<>(user);
    }

    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult<User> insertUser(@RequestBody @ApiParam(value = "用户信息") User user) {
        // 处理添加逻辑
        return new JsonResult<>(user);
    }

}
