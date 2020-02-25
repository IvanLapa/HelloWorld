package com.company.lecture3;

import java.util.Random;

public class Lecture3GenerateArray {
    public static void main (String[] args){
        int j = 0;
        double array[];
        array = new double[1000];
     while (j<array.length){
         Random random = new Random();
         array[j] = random.nextDouble();
         j++;
     } for (int i = 0; i<array.length; i++){
         System.out.println(array[i]);
        }
    }

}
