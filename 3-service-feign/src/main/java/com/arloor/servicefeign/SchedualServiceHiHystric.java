package com.arloor.servicefeign;

import org.springframework.stereotype.Component;

//service-hi断路时调用的方法。需要@Component加入容器，需要implements Feign的接口
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
