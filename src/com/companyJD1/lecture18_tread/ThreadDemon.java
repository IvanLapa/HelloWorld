package com.companyJD1.lecture18_tread;


import static com.companyJD1.lecture18_tread.ThreadIterate.iterate_sum;

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
