package com.ribbon.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/ribbondemo/getData")
    public String getData() {
        return "data";
    }
}
