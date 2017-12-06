package com.ribbon.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbondemo/comsumeData")
    public String getData() {
        String str = restTemplate.postForObject("http://Ribbon-Server/ribbondemo/getData",null,String.class);
        return "".equals(str)?"":str;
    }
}
