package com.hpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/jsp")
    public String html(){
        return "login";   //静态页面
    }
}
