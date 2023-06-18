package com.hpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Environment environment;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("springboot我来了");
        return "springboot";
    }

    //获取配置文件的属性内容(学生对象)
    @RequestMapping("/hello1")
    public String hello1(){
        //Environment对象是springboot中的内置对象，可以获取配置文件的任意属性
        String name = environment.getProperty("student.name");
        System.out.println("name = " + name);
        String age = environment.getProperty("student.age");
        System.out.println("age = " + age);
        return "成功了";
    }

    //获取配置文件中的数组中的数据
    @RequestMapping("/hello2")
    public String hello2(){
        String address = environment.getProperty("address[1]");
        System.out.println("address = " + address);
        return "成功了";
    }

    //获取配置文件中的数组中的数据
    @RequestMapping("/hello3")
    public String hello3(){
        String username = environment.getProperty("username");
        System.out.println("username = " + username);
        return "成功了";
    }

    @RequestMapping("/hello4")
    public String hello4(){
        String uname = environment.getProperty("uname");
        System.out.println("uname = " + uname);
        return "成功了";
    }

    //获取配置文件中的多层属性值
    @RequestMapping("/hello5")
    public String hello5(){
        String address = environment.getProperty("person.student.address");
        System.out.println("address = " + address);
        return "成功了";
    }
}
