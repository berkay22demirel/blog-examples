package com.berkay22demirel.postgresqlexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PostgresqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresqlExampleApplication.class, args);
    }

}
