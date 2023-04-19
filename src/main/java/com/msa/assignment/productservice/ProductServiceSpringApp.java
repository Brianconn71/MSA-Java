package com.msa.assignment.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductServiceSpringApp {
    public static void main(String[] args){
        SpringApplication.run(ProductServiceSpringApp.class, args);
    }
}
