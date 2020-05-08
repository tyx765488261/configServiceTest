package com.cic.spring_cloud_cosumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudCosumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCosumerApplication.class, args);
    }

}
