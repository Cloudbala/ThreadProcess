package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
* This is main method used to execute different implementations of Thread
* all aspects of Thread is tested with this application
*
* */
@SpringBootApplication
public class ThreadMain {

    public static void main(String[] args) {
        SpringApplication.run(ThreadMain.class, args);

      /*  ThreadGroup tg = new ThreadGroup("GroupA");
        ImplRun ir = new ImplRun(1);
        SecondImplRun sir = new SecondImplRun(1);

        Thread t1 = new Thread(tg, ir, "Thread 3");
        t1.start();
        Thread t2 = new Thread(tg, sir, "Thread 4");
        t2.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println("Join ");
        }


        // t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getName() + ":" + t2.getId() + ":" + t2.getPriority());

        System.out.println(t1.getName() + ":" + t1.getId() + ":" + t1.getPriority());
        //  t1.setPriority(4);
        System.out.println(t1.getName() + ":" + t1.getId() + ":" + t1.getPriority());
        if (t1.isAlive()) {
            System.out.println(Thread.currentThread().getState());
        }*/

// invokes the Thread class implementation
      /*  ImplThread it = new ImplThread(5);
        it.start();*/

        // To create a Thread Pool
        //   ExecutorService exeSer= Executors.newFixedThreadPool(10);

        /**
         *
         * Third Thread is used to test Thread Pool Implementation
         * */
       /* ExecutorService eserv = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable rserv = new ThirdImplRun("" + i);
            eserv.execute(rserv);
        }
        eserv.shutdown();
        while (!eserv.isTerminated()) {
            System.out.println("Executor is still alive");
        }
        System.out.println("Finished all threads");*/
        /**
         * Fourth Thread is tested on addShutdownHook(Thread Name)
         */

        FourthImplRun fr = new FourthImplRun("Fourth");
        Thread fr1 = new Thread(fr);
        Runtime run = Runtime.getRuntime();
        run.addShutdownHook(fr1);


    }


}
