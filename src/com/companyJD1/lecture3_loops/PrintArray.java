package com.companyJD1.lecture3_loops;

import java.util.Random;

/**Напишите программу, которая печатает массив сначала в обычном порядке,
 * затем в обратном.
 */

public class PrintArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + ";");
        }
        System.out.println();
        for ( int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ";");
        }
    }
}

