package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzq
 * @Date: 2019/5/8 23:01
 * @Version 1.0
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
