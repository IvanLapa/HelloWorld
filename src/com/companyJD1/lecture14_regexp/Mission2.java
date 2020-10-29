package com.companyJD1.lecture14_regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений и выводящую их на страницу.
 */

public class Mission2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("\\b0[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
