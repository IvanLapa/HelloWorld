package com.company.lecture30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mission7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        String date_str = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(date_str);
    }
}
