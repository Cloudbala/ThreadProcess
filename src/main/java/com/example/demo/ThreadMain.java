package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* This is main method used to execute different implementations of Thread
* all aspects of Thread is tested with this application
*
* */
@SpringBootApplication
public class ThreadMain {

    public static void main(String[] args) {
        SpringApplication.run(ThreadMain.class, args);

        ThreadGroup tg = new ThreadGroup("GroupA");
        ImplRun ir = new ImplRun(5);
        SecondImplRun sir = new SecondImplRun(10);

        Thread t1 = new Thread(tg, ir, "Thread 3");
        t1.start();
    /*    Thread t2=new Thread(tg,sir,"Thread 4");
        t2.start();
        System.out.println(t2.getName()+":"+t2.getId()+":"+t2.getPriority());*/

        System.out.println(t1.getName() + ":" + t1.getId() + ":" + t1.getPriority());
        t1.setPriority(4);
        System.out.println(t1.getName() + ":" + t1.getId() + ":" + t1.getPriority());
        if (t1.isAlive()) {
            System.out.println(Thread.currentThread().getState());
        }

// invokes the Thread class implementation
      /*  ImplThread it = new ImplThread(5);
        it.start();*/

    }
}
