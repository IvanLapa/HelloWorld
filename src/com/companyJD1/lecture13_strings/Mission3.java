package com.companyJD1.lecture13_strings;

import java.util.Scanner;

/**Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
 * если строка начинается и заканчивается этим словом.
 */

public class Mission3 {
    public static boolean isTheFirstWordSame (String string, String word){
         return string.startsWith(word)&&string.endsWith(word);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String w = scan.next();
        System.out.println(isTheFirstWordSame(s, w));
    }
}



