package com.company.lecture3;

public class FirstIntegers3_2 {
    public static void main (String[] args){
int[] array;
array = new int[100];
int i=0;
for (;i<array.length;i++){
    if (i%13==0||i%17==0) {
        array[i] = i;
        System.out.println(array[i]);
    }
}
    }
}
