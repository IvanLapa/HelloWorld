package com.company.lecture18;

import static com.company.lecture18.ThreadIterate.iterate_sum;

public class ThreadDemon extends Thread {
    public void demon() {
        if (ThreadIterate.isAlive) {
            System.out.println(iterate_sum);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
