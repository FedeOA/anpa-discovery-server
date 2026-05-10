package com.github.sanchezih.anpa_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AnpaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnpaDiscoveryServerApplication.class, args);
	}

}
