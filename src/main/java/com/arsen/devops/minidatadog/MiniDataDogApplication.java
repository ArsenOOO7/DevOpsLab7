package com.arsen.devops.minidatadog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class MiniDataDogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniDataDogApplication.class, args);
    }

}
