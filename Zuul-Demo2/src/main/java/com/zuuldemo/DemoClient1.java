package com.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author chendom
 * @date 2017/12/1 13:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoClient1 {
public static void main(String[] args){
    SpringApplication.run(DemoClient1.class,args);
}
}
