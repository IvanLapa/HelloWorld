package com.company.lecture2;

import java.util.Scanner;

public class Year {
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
