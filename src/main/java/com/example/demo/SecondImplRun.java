package com.example.demo;

/**
 * Created by bkesavan on 22-May-17.
 */
public class SecondImplRun implements Runnable {
    long num = 5;

    public  SecondImplRun(long num) {
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                System.out.println(num + i);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
