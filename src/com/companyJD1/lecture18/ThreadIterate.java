package com.companyJD1.lecture18;

public class ThreadIterate extends Thread{

    public static long iterate_sum;
    public void run (){
        for (int i=1; i<10000000; i++){
            if((i%2==0)&&(i%3==0)){
                iterate_sum+=i;
            } if (i%1000000==0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


