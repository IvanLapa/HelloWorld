package com.companyJD1.lecture2_operators;

import java.util.Scanner;

//Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
//Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100, то этот год не високосный, за исключением годов, делящихся на 400.
//Например:
//1992 - високосный
//1900 - не високосный
//2000 - високосный


public class Year2_3 {
    public static void main (String[] args) {
        System.out.println("Введите год:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + " - " + "високосный");
                } else {
                    System.out.println(year + " - " + "не високосный");
                }
            } else {
                System.out.println(year + " - " + "високосный");
            }
        } else {
            System.out.println(year + " - " + "не високосный");
        }
    }
}
