package com.doitgeek.companyprofileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CompanyProfileServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyProfileServiceApplication.class, args);
    }
}
