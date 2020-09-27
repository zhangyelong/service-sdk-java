package com.example.demo;

import iservice.sdk.core.ServiceClient;
import iservice.sdk.core.ServiceClientFactory;
import iservice.sdk.entity.options.ServiceClientOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) throws URISyntaxException {

		ServiceClientOptions options = new ServiceClientOptions();
		options.setRpcURI(new URI("http://58.33.6.114:26657"));
		options.setGrpcURI(new URI("http://58.33.6.114:9090"));
		ServiceClient client = ServiceClientFactory.getInstance()
				.setOptions(options)
				.addListener(new TestConsumerListener())
				.getClient();
		client.getKeyService().recoverKey("consumer", "123456", "shaft project fragile chicken napkin script toy repeat candy eye screen social toy quick unlock food service number genius basket either muffin auction come", true, 0, "");
		client.start();

		SpringApplication.run(ConsumerApplication.class, args);
	}

}
