package com.hpf.dao;

import com.hpf.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao{

    //查询用户
    @Select("select * from user")
    List<User> findAllUser();
}
