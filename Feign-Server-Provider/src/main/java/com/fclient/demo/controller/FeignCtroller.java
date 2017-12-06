package com.fclient.demo.controller;

import com.fclient.demo.service.FeignService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chendom
 * @date 2017/11/30 10:33
 */
@RestController
public class FeignCtroller implements FeignService{


    @Override
    public String getAllInformation() {
        return "this test data";
    }
}
