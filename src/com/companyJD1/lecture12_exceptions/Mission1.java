package com.companyJD1.lecture12_exceptions;

/**Объявите переменную со значением null.
 * Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 */

public class Mission1 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            s = "qwe";
        }
        System.out.println(s);
    }
}
