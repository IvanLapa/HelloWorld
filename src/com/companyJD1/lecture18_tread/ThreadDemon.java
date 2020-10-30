package com.companyJD1.lecture18_tread;


import java.util.concurrent.atomic.AtomicLong;

public class ThreadDemon extends Thread {
    private AtomicLong sum;

    public ThreadDemon(AtomicLong sum) {
        this.sum = sum;
        setDaemon(true);
        start();
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(11);
                System.out.println("[DaemonThread] sum:" + sum.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
