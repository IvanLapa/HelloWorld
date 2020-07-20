package com.companyJD1.lecture30;

import java.time.LocalDate;


public class Mission6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate plus3Months = date.plusMonths(3);
        System.out.println(plus3Months);
    }
}
