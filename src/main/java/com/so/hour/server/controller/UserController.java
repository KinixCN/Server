package com.so.hour.server.controller;

/*
* 以下接口实现获取用户存档、创建用户初始存档的功能。
* 接口实现于2022年1月24日
* 最后更新于2022年1月24日
* 最后更新执行人：陈诺
* */

import com.so.hour.server.entity.User;
import com.so.hour.server.entity.UserSimple;
import com.so.hour.server.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/getusr")
public class UserController {
    @Resource
    UserMapper userMapper;

    @PostMapping
    public List<User> getUser(@RequestBody UserSimple user) {
        List<User> userList = userMapper.selectAll(user);
        if(userList.isEmpty()) {
            userMapper.add(user);
            userList = userMapper.selectAll(user);
        }
        System.out.println(userList);

        return userList;
    }

}
