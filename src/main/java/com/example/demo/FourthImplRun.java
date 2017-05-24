package com.example.demo;

/**
 * Created by bkesavan on 24-May-17.
 */
public class FourthImplRun implements Runnable {
    String str=null;
    FourthImplRun(String str){
        this.str=str;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        process();
    }
    public void process() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
