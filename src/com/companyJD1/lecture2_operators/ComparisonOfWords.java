package com.companyJD1.lecture2_operators;

import java.util.Scanner;

/**Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
 * Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
 * Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
 * Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length()
 */
public class ComparisonOfWords {
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
