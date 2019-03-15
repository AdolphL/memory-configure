package com.adolph.memory;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
