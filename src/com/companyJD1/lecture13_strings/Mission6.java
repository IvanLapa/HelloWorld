package com.companyJD1.lecture13_strings;

public class Mission6 {
    public static void main(String[] args) {
        String string = "aaabbcdeef";
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
