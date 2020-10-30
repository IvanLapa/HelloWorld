package com.companyJD1.lecture20_thread_executer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**Задан массив случайных целых чисел (от 1 до 300) случайной длины (1 млн элементов).
 * Найти максимальный элемент в массиве двумя способами: в одном потоке и используя 10 потоков.
 * Сравнить затраченное в обоих случаях время.
 */

public class Mission2 extends Thread{
    static int[] random_numbers = new int[1000000];
    int start;
    int end;
    int max_number = 0;
    Mission2(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public static void main(String[] args){

        for (int i = 0; i < random_numbers.length; i++) {
            random_numbers[i] = (int) (Math.random()*300);
        }

        ExecutorService executor_service = Executors.newSingleThreadExecutor();
        AtomicLong start = new AtomicLong();
        AtomicLong finish = new AtomicLong();

        executor_service.submit(() -> {
            int max_number = 0;
            start.set(System.nanoTime());
            for (int value : random_numbers) {
                if (max_number < value) {
                    max_number = value;
                }
            }
            finish.set(System.nanoTime());
            System.out.println("one thread: " + (finish.get() - start.get()));
        });

        executor_service.shutdown();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        AtomicLong start2 = new AtomicLong(System.nanoTime());
        Mission2 one;
        Mission2 two;
        Mission2 three;
        Mission2 four;
        Mission2 five;
        Mission2 six;
        Mission2 seven;
        Mission2 eight;
        Mission2 nine;
        Mission2 ten;
        executorService.submit(one = new Mission2(0, 100000));
        executorService.submit(two = new Mission2(100000, 200000));
        executorService.submit(three = new Mission2(200000, 300000));
        executorService.submit(four = new Mission2(300000, 400000));
        executorService.submit(five = new Mission2(400000, 500000));
        executorService.submit(six = new Mission2(500000, 600000));
        executorService.submit(seven = new Mission2(600000, 700000));
        executorService.submit(eight = new Mission2(700000, 800000));
        executorService.submit(nine = new Mission2(800000, 900000));
        executorService.submit(ten = new Mission2(900000, 1000000));
        List<Mission2> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
        list.add(ten);
        executorService.shutdown();

        int max = 0;

        if(executorService.isShutdown()) {
            for (Mission2 exercise2 : list) {
                if (exercise2.getMaxNumber() > max) {
                    max = exercise2.getMaxNumber();
                }
            }
        }

        AtomicLong finish2 = new AtomicLong(System.nanoTime());
        System.out.println("ten threads: " + (finish2.get()-start2.get()));
    }

    @Override
    public void run() {
        for (int j = start; j < end; j++) {
            if (max_number < random_numbers[j]) {
                max_number = random_numbers[j];
            }
        }
    }

    public int getMaxNumber() {
        return max_number;
    }
}

