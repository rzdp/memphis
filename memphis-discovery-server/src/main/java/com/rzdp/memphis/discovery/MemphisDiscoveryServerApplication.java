package com.rzdp.memphis.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MemphisDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemphisDiscoveryServerApplication.class, args);
    }

}
