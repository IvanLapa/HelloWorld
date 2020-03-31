package com.company.lecture14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mission5 {
    public static void main(String[] args) {
        String input = "0.11.255.230 0.01.255.11 3.256.12.21 1.1.1.1";
        Pattern pattern = Pattern.compile("(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
                
    }
}
