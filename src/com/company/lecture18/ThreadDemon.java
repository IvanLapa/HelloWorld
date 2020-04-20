package com.company.lecture18;


import static com.company.lecture18.ThreadIterate.iterate_sum;

public class ThreadDemon extends Thread {
    public void run() {
        for (;;) {
            System.out.println(iterate_sum);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
