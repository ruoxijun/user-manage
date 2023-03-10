package top.ruoxijun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.ruoxijun.entity.User;
import top.ruoxijun.service.UserService;

import java.util.List;

/**
 * @program: user-manage
 * @description: test controller
 * @author: ruoxijun
 * @create: 2023-02-21 21:31
 **/

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public List<User> hello(){
        List<User> userList = userService.list(null);
        return userList;
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
