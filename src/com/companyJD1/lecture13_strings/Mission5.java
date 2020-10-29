package com.companyJD1.lecture13_strings;

import java.util.Scanner;

/**Подсчитать количество слов в тексте.
 * Учесть, что слова могут разделяться несколькими пробелами.
 */

public class Mission5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int count=0;
        if (string.length()!=0) {
            count++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Кол-во слов"+count);
    }
}
