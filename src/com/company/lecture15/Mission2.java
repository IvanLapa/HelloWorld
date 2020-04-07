package com.company.lecture15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mission2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("for_lecture15_can_delete");
        Scanner sc = new Scanner(file);
        String line;
        while (sc.hasNext()) {
            Pattern pattern = Pattern.compile("\\b([aeiouyAEIOUY]\\w*)");
            Matcher matcher = pattern.matcher(sc.nextLine());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
