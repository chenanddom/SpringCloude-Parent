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
public class DemoClient2 {
public static void main(String[] args){
    SpringApplication.run(DemoClient2.class,args);
}
}
