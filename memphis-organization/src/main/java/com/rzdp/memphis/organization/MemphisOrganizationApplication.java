package com.rzdp.memphis.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MemphisOrganizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemphisOrganizationApplication.class, args);
    }

}
