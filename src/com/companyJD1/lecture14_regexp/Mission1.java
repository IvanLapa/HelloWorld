package com.companyJD1.lecture14_regexp;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mission1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Чего смотришь - вводи мыло, если нечем больше заняться");
        String email = sc.nextLine();
        Pattern pattern = Pattern.compile("\\^\\D\\w+@org.com");
        Matcher matcher = pattern.matcher(email);
        boolean m = matcher.matches();
        if (m = true){
            System.out.println("Мыло нормальное");
        }else {
            System.out.println("Не тупи!!! Введи мыло нормально, Жорик!");
        }

    }
}
