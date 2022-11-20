package com.berkay22demirel.asyncexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@EnableAsync
@SpringBootApplication
public class AsyncExampleApplication {

    @Autowired
    private AsyncService asyncService;

    public static void main(String[] args) {
        SpringApplication.run(AsyncExampleApplication.class, args);
    }

    @PostConstruct
    public void postConstructor() {
        IntStream.range(1, 11).forEach(i -> {
            System.out.println("Starting async method for i : " + i);
            asyncService.asyncFunctionForTaskExecutor1(i);
            asyncService.asyncFunctionForTaskExecutor2(i);
        });
    }

    /*IntStream.range(1, 11).forEach(i -> {
            System.out.println("Starting async method for i : " + i);
            asyncService.asyncFunction(i);
        });*/
}
