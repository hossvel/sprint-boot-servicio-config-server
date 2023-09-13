package com.devhoss.app.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SprintBootServicioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootServicioConfigServerApplication.class, args);
	}

}
