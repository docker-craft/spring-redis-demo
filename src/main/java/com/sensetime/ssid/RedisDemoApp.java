package com.sensetime.ssid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.sensetime.ssid.*"})
public class RedisDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApp.class,args);
    }
}
