package com.company.lecture13;

import java.time.Clock;
import java.time.LocalTime;

public class Mission1 {
    public static void main(String[] args) {
    String first_string = "Java";
    String second_string = "is the best";
    String third_string = "from my discovery";
// сложения обьектов класса String
        long start =System.nanoTime();
        String all1 = first_string.concat(second_string.concat(third_string));
        long finish =System.nanoTime();
        System.out.println(finish-start);
// сложения обьектов класса String
    String all12 = first_string+second_string+third_string;
// StringBuilder и метода append
    StringBuilder string = new StringBuilder(first_string);
    string.append(second_string).append(third_string);
    }
}
