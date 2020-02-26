package com.company.lecture3;

import java.util.Random;

public class Lecture3GenerateArray {
    public static void main(String[] args) {
        int j = 0; // генерация массива вещественных чисел
        double array[];
        array = new double[1000];
        while (j < array.length) {
            Random random = new Random();
            array[j] = random.nextDouble();
            j++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int count = 0; // поиск среднего значения
        double summ = 0;
        while (count < array.length) {
            summ += array[count];
            count++;
        }
        double average;
        average = summ / count;
        System.out.println("Среднее значение = " + average);

        double minimal = 0; // определение минимального значения
        int count1 = 0;
        double temporary1;
        for (temporary1 = array[count1]; count1 < array.length; count1++) {
            if (array[count1] < temporary1) {
                minimal = array[count1];
            }
        }
        System.out.println("Минимальное значение = " + minimal);

        double max = 0; // определение максимального значения
        int count2 = 0;
        double temporary2;
        for (temporary2 = array[count2]; count2 < array.length; count2++) {
            if (array[count2] > temporary2) {
                max = array[count2];
            }
        }
        System.out.println("Максимальное значение = " + max);

        int count3; // сортировка массива
        int temporary3;
        int minIndex;
        for (count3 = 0; count3 < array.length; count3++) {
            minIndex = count3;
            for (temporary3 = count3 + 1; temporary3 < array.length; temporary3++) {
                if (array[temporary3] < array[minIndex]) {
                    minIndex = temporary3;
                }
            }
            double temp = array[count3];
            array[count3] = array[minIndex];
            array[minIndex] = temp;
        }
        for (count3 = 0; count3 < array.length; count3++) {
            System.out.println(array[count3]);
        }

    }
}
