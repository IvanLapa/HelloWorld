package com.companyJD1.lecture13_strings;

import java.util.Scanner;

/**Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 * Пример: aaabbcdeef ->abcdef
 */

public class Mission6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        char x = string.charAt(0);
        String string_finish = String.valueOf(x);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != x) {
                x = string.charAt(i);
                string_finish+=String.valueOf(x);
            }
        }
        System.out.println(string_finish);
    }
}
