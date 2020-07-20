package com.companyJD1.lecture17;

import java.util.Arrays;
import java.util.List;

public class Mission1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 15, 6, 35, 45);
        double result = numbers.stream()
                .filter((number) -> number!=null && number%2!=0 && number%5==0)
                .mapToLong(element -> element)
                .average()
                .orElse(0);
        System.out.println(result);
    }
}
