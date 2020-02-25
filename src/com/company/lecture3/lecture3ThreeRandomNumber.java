package com.company.lecture3;

import java.util.Random;

public class lecture3ThreeRandomNumber {
    public static void main (String[] args){
    int array[];
    array=new int[3];
    int i=0;
    while (i<array.length){
        Random random=new Random();
        int j = (random.nextInt());
        if (j>=10&&j<=99) {
            array[i] = j;
            System.out.print(array[i] + " ");
            i++;
        }
    }if (array[2]>array[1]) {
        if (array[1]>array[0]) {
            System.out.println("массив строго возрастающий");
        }   else {
            System.out.println("массив не возрастающий");
        }
        }   else{
                System.out.println("массив не возрастающий");
            }
        }
    }
