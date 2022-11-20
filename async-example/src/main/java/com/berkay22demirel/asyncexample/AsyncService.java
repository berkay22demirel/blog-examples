package com.berkay22demirel.asyncexample;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void asyncFunction(int i) {
        System.out.println("Started async method for i : " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished async method for i : " + i);
    }

    @Async(value = "threadPoolTaskExecutor1")
    public void asyncFunctionForTaskExecutor1(int i) {
        System.out.println("Started async method for : " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished async method for : " + Thread.currentThread().getName());
    }

    @Async(value = "threadPoolTaskExecutor2")
    public void asyncFunctionForTaskExecutor2(int i) {
        System.out.println("Started async method for : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished async method for : " + Thread.currentThread().getName());
    }
}
