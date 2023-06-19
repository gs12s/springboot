package com.hpf.service;

import com.hpf.pojo.User;

import java.util.List;

public interface UserService {

    //查询用户
    List<User> findAllUser();
}
