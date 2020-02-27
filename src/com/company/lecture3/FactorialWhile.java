package com.company.lecture3;

import java.util.Scanner;

public class FactorialWhile {
    public static void main (String[] args){
        System.out.println("Введите число");
        Scanner sc;
        sc = new Scanner(System.in);
        int input_number=sc.nextInt();
        int counter=2;
        int factorial_up=1;
        while (counter<=input_number){
            factorial_up *=counter;
            counter++;
        }
        System.out.println("Факториал " + input_number + " = " + factorial_up);
    }
}
