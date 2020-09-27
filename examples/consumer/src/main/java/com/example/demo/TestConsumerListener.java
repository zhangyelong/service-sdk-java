package com.example.demo;

import com.alibaba.fastjson.JSON;
import iservice.sdk.core.AbstractConsumerListener;
import iservice.sdk.entity.options.ConsumerListenerOptions;

/**
 * @author Yelong
 */
public class TestConsumerListener extends AbstractConsumerListener<TestServiceResponse.TestOutput> {

    @Override
    public ConsumerListenerOptions getOptions() {
        ConsumerListenerOptions options = new ConsumerListenerOptions();
        options.setAddress("iaa1vrh28848qh5sl4ryfvl42nv6jd6twn2fz85hm7");
        options.setModule("service");
        options.setServiceName("test");
        options.setSender("iaa1dwlfeqh5x4982fxmdy0wzsparle7lahljm6cf7");
        return options;
    }

    @Override
    protected Class<TestServiceResponse.TestOutput> getReqClass() {
        return TestServiceResponse.TestOutput.class;
    }

    @Override
    public void onResponse(TestServiceResponse.TestOutput res) {
        System.out.println("----------------- Consumer -----------------");
        System.out.println("Got response: "+ JSON.toJSONString(res));
    }

}
