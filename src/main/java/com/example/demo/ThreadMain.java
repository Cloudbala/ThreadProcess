package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadMain {

    public static void main(String[] args) {
        SpringApplication.run(ThreadMain.class, args);

        ThreadGroup  tg = new ThreadGroup("GroupA");
        ImplRun ir = new ImplRun(5);
        SecondImplRun sir= new SecondImplRun(10);
        new Thread(tg,ir,"Thread 3").start();
        new Thread(tg,sir,"Thread 4").start();

//        ImplThread it = new ImplThread(5);
//        it.start();

    }
}
