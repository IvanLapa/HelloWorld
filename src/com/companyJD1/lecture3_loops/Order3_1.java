package com.companyJD1.lecture3_loops;

public class Order3_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;

        for (; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        do {
            i--;
            System.out.print(array[i] + " ");
        } while (i > 0);
    }
}

