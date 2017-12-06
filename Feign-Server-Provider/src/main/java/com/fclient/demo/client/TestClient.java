package com.fclient.demo.client;

import com.fclient.demo.service.FeignService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author chendom
 * @date 2017/11/30 10:36
 */
@FeignClient(name = "Feign-Server-Provider")
public interface TestClient extends FeignService{
}
