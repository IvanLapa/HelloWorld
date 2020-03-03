package com.company.lecture3;

public class MethodEquals3_5 {
    public static void myEquals(int array1[][], int array2[][], int stroka, int stolbec){
        if (array1[stroka][stolbec]==array2[stroka][stolbec]){
            System.out.println("\nЭлементы равны");
        }else {
            System.out.println("\nЭлементы не равны");
        }
    }
    public static void main (String [] args){
        int array1[][];
        array1 = new int [5][5];
        System.out.println("Первый массив:");
        for (int count_stroka=0; count_stroka<array1.length; count_stroka++){
            for (int count_stolbec=0; count_stolbec<array1[count_stroka].length; count_stolbec++){
                array1[count_stroka][count_stolbec]=(int)(Math.random()*10);
                System.out.print(array1[count_stroka][count_stolbec] + " ");
            }
            System.out.println();
        }
        int array2[][];
        array2 = new int[5][5];
        System.out.println("\nВторой массив:");
        for (int count_stroka=0; count_stroka<array2.length; count_stroka++){
            for (int count_stolbec=0; count_stolbec<array2[count_stroka].length; count_stolbec++){
                array2[count_stroka][count_stolbec]=(int)(Math.random()*10);
                System.out.print(array2[count_stroka][count_stolbec] + " ");
            }
            System.out.println();
        }
        myEquals(array1, array2, 3,3 );
    }
}
