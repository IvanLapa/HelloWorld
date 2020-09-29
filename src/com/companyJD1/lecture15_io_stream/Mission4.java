package com.companyJD1.lecture15_io_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mission4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("for_lecture15_can_delete");
        Scanner sc = new Scanner(file);
        Pattern pattern = Pattern.compile("\\.*\\b[\\d]\\d*");
        String str = null;
        int count = 0;
        while (sc.hasNext()) {
            Matcher matcher = pattern.matcher(sc.nextLine());
                while (matcher.find()) {
                    if (matcher.group().length() > count) {
                        count = matcher.group().length();
                        str = matcher.group();
                     }
                }
        }
        System.out.println(str);
    }
}