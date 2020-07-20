package com.companyJD1.lecture19;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Mission1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExecutorService executor_service = Executors.newSingleThreadExecutor();
        while (true) {
            int time = sc.nextInt();
            if(time == -1){
                executor_service.shutdown();
            }
            executor_service.submit(() -> {
                try {
                    TimeUnit.SECONDS.sleep(time);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                System.out.println("Я спал " + time + " секунд");
            });
        }
    }
}
