package com.lege.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lege.entity.UserInfo;

/**
 * @author lege
 * @Description
 * @create 2022-03-09 15:52
 */
public interface UserInfoService extends IService<UserInfo> {
    String addUser(Integer addCount);
}
