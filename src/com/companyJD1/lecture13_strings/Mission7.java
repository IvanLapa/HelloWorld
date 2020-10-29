package com.companyJD1.lecture13_strings;

/**Написать функцию, принимающую на вход целое число,
 * возвращающую строку из 10 символов, дополненных слева нулями.
 * Если число выходит за размер 10 символов вернуть все нули.
 * Пример getString(22) -> 0000000022
 * Найти 3 способа решения задачи и определить наиболее быстрый способ.
 */

public class Mission7 {
    public static void main(String[] args) {
        int in_number = 10;
        Integer number = (Integer)in_number;
        String string = number.toString();
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            count++;
        }
        if (count<10){
        }
    }
}
