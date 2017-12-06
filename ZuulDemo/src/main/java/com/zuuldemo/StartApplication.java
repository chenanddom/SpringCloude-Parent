package com.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author chendom
 * @date 2017/12/1 13:44
 */
@SpringBootApplication
@EnableZuulProxy
public class StartApplication {
public static void main(String[] args){
    SpringApplication.run(StartApplication.class,args);
}
}
