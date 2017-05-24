package com.example.demo;

/**
 * Created by bkesavan on 24-May-17.
 */
public class ThirdImplRun implements Runnable {

    String str = null;

    ThirdImplRun(String str) {
        this.str = str;;
    }

    public void run() {
        System.out.println("Start"+Thread.currentThread().getName());
        process();
        System.out.println("End"+Thread.currentThread().getName());
    }

    private void process() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
