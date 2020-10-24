package com.companyJD1.lecture3_loops;

import java.util.Scanner;

/**Написать алгоритм расчета факториала, используя циклы (for и while).
 */

public class FactorialFor {
    public static void main (String[] args){
        System.out.println("Введите число");
        Scanner sc;
        sc = new Scanner(System.in);
        int input_number=sc.nextInt();
        int counter=2;
        int factorial_up=1;
        for (; counter<=input_number;){
        factorial_up *=counter;
        counter++;
        }
        System.out.println("Факториал " + input_number + " = " + factorial_up);
    }
}
