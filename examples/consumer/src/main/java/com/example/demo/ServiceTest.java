package com.example.demo;

import iservice.sdk.core.ServiceClient;
import iservice.sdk.core.ServiceClientFactory;
import iservice.sdk.entity.options.ServiceClientOptions;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Yelong
 */
public class ServiceTest {

    public static void main(String[] args) throws URISyntaxException, IOException {
        ServiceClientOptions options = new ServiceClientOptions();
        options.setGrpcURI(new URI("http://58.33.6.114:9090"));
        options.setRpcURI(new URI("http://58.33.6.114:26657"));
        ServiceClient client = ServiceClientFactory.getInstance().setOptions(options).getClient();
        client.getKeyService().recoverKey("consumer", "123456", "shaft project fragile chicken napkin script toy repeat candy eye screen social toy quick unlock food service number genius basket either muffin auction come", true, 0, "");

        client.callService(new TestServiceRequest());
    }

}
