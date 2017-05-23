package com.example.demo;

/**
 * Created by bkesavan on 22-May-17.
 */
public class ImplRun implements Runnable {

    long num = 5;

   public  ImplRun(long num) {
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
               // System.out.println(Thread.currentThread().getState());
                Thread.sleep(1000);
                while(i==6||i==7){
                    Thread.yield();
                }
                //System.out.println(Thread.currentThread().getState());
                System.out.println(num + i);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
