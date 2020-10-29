package com.companyJD1.lecture14_regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 * и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 * X - код оператора
 * Y - номер телефона
 */

public class Mission4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String output = "";
        Pattern pattern = Pattern.compile("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(str);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            stringBuilder
                    .append(" ")
                    .append(matcher.group(1))
                    .append("(")
                    .append(matcher.group(2))
                    .append(")")
                    .append(matcher.group(3))
                    .append("-")
                    .append(matcher.group(4))
                    .append("-")
                    .append(matcher.group(5));
        }
        System.out.println(output = stringBuilder.toString());
    }
}