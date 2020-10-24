package com.companyJD1.lecture2_operators;

import java.util.Scanner;

/**Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100, то этот год не високосный, за исключением годов, делящихся на 400.
 * Например:
 * 1992 - високосный
 * 1900 - не високосный
 * 2000 - високосный
 */

public class LeapYear {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;
        do {
            System.out.println("Введите год:");
            while (!scan.hasNextInt()) {
                System.out.println("Введите пожалуйста число(год):");
                scan.next();
            }
            year = scan.nextInt();
        } while (year <= 0);
        if (year%4==0 && year%400==0){
            System.out.println(year+" високосный");
        }else if((year%4==0 && year%100==0) && year%400!=0){
            System.out.println(year+" не високосный");
        }else if (year%4==0 && year%100!=0 && year%400!=0)
            System.out.println(year+" високсоный");
    }
}
