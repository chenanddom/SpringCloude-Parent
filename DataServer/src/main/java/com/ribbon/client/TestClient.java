package com.ribbon.client;

import com.ribbon.service.FeignServices;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author chendom
 * @date 2017/11/30 10:36
 */
@FeignClient(name = "DataServer",fallback = TestClient.TestClientFallbackFactory.class)
public interface TestClient extends FeignServices {
    @Component
    class TestClientFallbackFactory implements FallbackFactory<TestClient>{

        @Override
        public TestClient create(Throwable throwable) {
            return new TestClient() {
                @Override
                public String getConfig() {
                    return "暂时无法使用此接口";
                }
            };
        }
    }
}
