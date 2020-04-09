package com.company.lecture17;

import java.util.Arrays;
import java.util.List;

public class Mission2 {
    public static void main(String[] args) {
    List<String> string_list = Arrays.asList("Hello Ivan", "world is mine", "hello", "Ivan");
    long count = string_list.stream().filter(str->str.length()>8).distinct().count();
        System.out.println(count);
    }
}
