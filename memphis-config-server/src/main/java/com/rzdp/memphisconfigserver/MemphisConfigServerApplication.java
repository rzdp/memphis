package com.rzdp.memphisconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.validation.Valid;

@SpringBootApplication
@EnableConfigServer
public class MemphisConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemphisConfigServerApplication.class, args);
    }
}
