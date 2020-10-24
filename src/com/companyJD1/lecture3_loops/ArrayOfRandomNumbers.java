package com.companyJD1.lecture3_loops;

import java.util.Random;

/**Создать массив из 3 случайных целых чисел из отрезка [10;99],
 * вывести его на экран в строку. Определить и вывести на экран
 * сообщение о том, является ли массив строго возрастающей последовательностью.
 */

public class ArrayOfRandomNumbers {
    public static void main (String[] args){
        int array[] = new int[3];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(89) + 10;
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        if (array[0] < array[1] && array[1] < array[2]) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else System.out.println("Массив не является строго возрастающей последовательностью");
    }
}
