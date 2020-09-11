package com.qimu.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {
    public String adminlist(){
        System.out.println("管理员页面进来了。。。");
        return "list";
    }

}

