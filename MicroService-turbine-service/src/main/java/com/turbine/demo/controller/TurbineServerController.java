package com.turbine.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurbineServerController {
    @RequestMapping("/getInformation")
    public String getInformation(){
    return "information";
    }
}
