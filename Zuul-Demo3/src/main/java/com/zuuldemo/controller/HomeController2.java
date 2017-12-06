package com.zuuldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendom
 * @date 2017/12/1 13:56
 */
@RestController
public class HomeController2 {

    @RequestMapping("/index2")
    public Object index() {
        return "index2";
    }

    @RequestMapping("/home2")
    public Object home() {
        return "home2";
    }
}