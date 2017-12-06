package com.ribbon.controller;
import com.fclient.demo.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

/**
 * @author chendom
 * @date 2017/11/28 13:48
 */
@RestController
@RequestMapping("/information")
public class InformationController {
    @Autowired
    private TestClient testClient;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getInfo")
    public String getInformation(){

        return restTemplate.postForObject("http://DataServer/provider/getData",null,String.class);
        }
    @RequestMapping("/getConfiguration")
    public String FeiClientTest(){
        String string = testClient.getAllInformation();
        return string;
    }
}
