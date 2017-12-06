package com.fclient.demo.controller;

import com.fclient.demo.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendom
 * @date 2017/11/30 10:38
 */
@RestController
public class TestController {
    @Autowired
    private TestClient testClient;
    @RequestMapping("/test/getData")
    public String getData(){
    return testClient.getAllInformation()==null?"null data":testClient.getAllInformation();
}

}
