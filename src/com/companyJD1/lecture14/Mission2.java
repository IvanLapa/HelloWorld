package com.companyJD1.lecture14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mission2 {
    public static void main(String[] args) {
        String input = "0x5382467AB 0X32432de 1234 0b101010";
        Pattern pattern = Pattern.compile("\\b0[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
