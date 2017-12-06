package com.turbine.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TurbineController {
    @Autowired
    private RestTemplate restTemplate;
@RequestMapping("/turbine2/getData2")
@HystrixCommand(fallbackMethod = "getInformationFallback")
public String getData(){
    String result = restTemplate.postForObject("http://MicroService-turbine-service/getInformation",null,String.class);
    return StringUtils.isEmpty(result)?"":result;
}
    public String getInformationFallback() {
        return "无法请求该接口";
    }
}
