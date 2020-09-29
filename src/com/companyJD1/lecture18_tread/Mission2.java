package com.companyJD1.lecture18_tread;

public class Mission2 {
    public static void main(String[] args) throws InterruptedException {

        Dump dump=new Dump();

        Factory factory=new Factory(dump);
        Scientist scientist=new Scientist(dump);

        new Thread(factory).start();
        Thread.sleep(20);
        new Thread(scientist).start();
    }
}
