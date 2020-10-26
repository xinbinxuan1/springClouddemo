package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/toorder")
    public String toorder(){
        return "order";
    }

    @RequestMapping("/touser")
    public String touser(){
        return "user";
    }
}
