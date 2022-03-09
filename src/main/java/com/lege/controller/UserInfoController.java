package com.lege.controller;

import com.lege.entity.UserInfo;
import com.lege.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lege
 * @Description
 * @create 2022-03-09 15:55
 */
@RestController
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/listUser")
    public List<UserInfo> listUser() {

        return userInfoService.list();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam Integer addCount) {
        return userInfoService.addUser(addCount);

    }
}