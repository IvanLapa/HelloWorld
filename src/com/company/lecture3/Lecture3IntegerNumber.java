package com.company.lecture3;

import java.util.Scanner;

public class Lecture3IntegerNumber {
    public static void main(String[] args) {
        System.out.println("Введите число больше 1:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String str1 = " является простым числом";
        String str2 = " не является простым числом";
        switch (i) {
            case 2:
                System.out.println(i + str1);
                break;
            case 3:
                System.out.println(i + str1);
                break;
            case 5:
                System.out.println(i + str1);
                break;
            case 7:
                System.out.println(i + str1);
                break;
            case 11:
                System.out.println(i + str1);
                break;
            case 13:
                System.out.println(i + str1);
                break;
            case 17:
                System.out.println(i + str1);
                break;
            case 19:
                System.out.println(i + str1);
                break;
            default:
        if (i % 2 == 0) {
                System.out.println(i + str2);
            }   else if (i % 3 == 0) {
                System.out.println(i + str2);
            }   else if (i % 5 == 0) {
                System.out.println(i + str2);
            }   else if (i % 7 == 0) {
                System.out.println(i + str2);
            }   else if (i % 11 == 0) {
                System.out.println(i + str2);
            }   else if (i % 13 == 0) {
                System.out.println(i + str2);
            }   else if (i % 17 == 0) {
                System.out.println(i + str2);
            }   else if (i % 19 == 0) {
                System.out.println(i + str2);
            }   else {
                System.out.println(i + str1);
            }
        }
    }
}