package com.example.demo;

import iservice.sdk.core.ServiceClient;
import iservice.sdk.core.ServiceClientFactory;
import iservice.sdk.entity.options.ServiceClientOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) throws URISyntaxException {

		ServiceClientOptions options = new ServiceClientOptions();
		options.setRpcURI(new URI("http://58.33.6.114:26657"));
		options.setGrpcURI(new URI("http://58.33.6.114:9090"));
		ServiceClient client = ServiceClientFactory.getInstance()
				.setOptions(options)
				.addListener(new TestProviderListener())
				.getClient();
		client.getKeyService().recoverKey("provider", "123456", "wine source region length stomach flip skill hazard accuse jacket warm obtain gather ocean farm silk ocean action south pair twist fantasy subway horse", true, 0, "");
		client.start();
		SpringApplication.run(ProviderApplication.class, args);
	}

}
