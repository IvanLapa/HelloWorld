package com.companyJD1.lecture18_tread;

public class Mission1 {
   public static void main(String[] args) {
       Thread thread1 = new Thread(new ThreadIterate());
       Thread thread2 = new Thread(new ThreadDemon());
       thread1.start();
       thread2.start();
   }
}
