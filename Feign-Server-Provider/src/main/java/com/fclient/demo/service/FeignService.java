package com.fclient.demo.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chendom
 * @date 2017/11/30 10:34
 */
public interface FeignService {
@RequestMapping("/getInfo")
String getAllInformation();

}
