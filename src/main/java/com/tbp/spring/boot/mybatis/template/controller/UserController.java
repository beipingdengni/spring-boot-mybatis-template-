package com.tbp.spring.boot.mybatis.template.controller;

import com.tbp.spring.boot.mybatis.template.service.UserService;
import com.tbp.spring.boot.mybatis.template.vo.UserReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * describe:
 *
 * @author mac 田北平
 * @date 2019/12/11 11:58
 */
@Api(value = "用户查询接口", tags = {"用户操作接口"})
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("添加用户")
    @PostMapping(path = "add")
    public Object getAddUser(@RequestBody UserReq req) {
        userService.addUser(req);
        return true;
    }

    @GetMapping("index")
    public Object index() {
        return "ok ---> " + UUID.randomUUID().toString();
    }


    @ApiOperation(value = "查询用户通过ID", notes = "主要传递的值")
    @ApiImplicitParam(name = "id", value = "用户id", paramType = "query", required = true, dataType = "Long")
    @GetMapping(path = "/get/{id}")
    public Object getAddUser(@PathVariable("id") Long id) {
        return userService.queryUser(id);
    }

    @PostMapping(path = "update")
    public Object updateUser(@RequestBody UserReq req) {
        return userService.updateUserById(req);
    }


}
