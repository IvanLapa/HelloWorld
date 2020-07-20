package com.companyJD1.lecture2;

import java.util.Scanner;

public class Words2_1 {
    public static void main(String[] args) {
        System.out.println("Введите два слова:");
        Scanner sc1 = new Scanner(System.in);
        String Str1 = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        String Str2 = sc2.next();
        if (Str1.equals(Str2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (Str1.equalsIgnoreCase(Str2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (Str1.length()==Str2.length()) {
            System.out.println("Ну, хотя бы они одной длины");
        } else {
            System.out.println("Слова совершенно разные");
        }
    }
}
