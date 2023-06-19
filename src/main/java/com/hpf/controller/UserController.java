package com.hpf.controller;

import com.hpf.pojo.User;
import com.hpf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    public String findAllUser(Model model){
        List<User> allUser = userService.findAllUser();
        for (User user : allUser) {
            System.out.println("user = " + user);
        }
        model.addAttribute("user",allUser);
        return "login";
    }
}
