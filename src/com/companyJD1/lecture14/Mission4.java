package com.companyJD1.lecture14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mission4 {
    public static void main(String[] args) {
        //блок который находит теелфоны согаслно тех заданию
        String input = "+375256480418 80293161514 +375448141253";
        Pattern pattern = Pattern.compile("\\+\\d{12}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find())
            System.out.println(matcher.group());
        // блок который рвет телефон на нужные группы
        String tel = "+375256480418";
        String tel2 = tel.replaceAll("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5");
        System.out.println(tel2);
    }
}
// какми методом сявзать всю эту историю не знаю