package com.company.lecture30;

import java.time.LocalDate;
import java.time.Period;

public class Mission9 {
    public static void main(String[] args) {
        LocalDate date_now = LocalDate.now();
        LocalDate date_random = LocalDate.of(2020,6,25);
        Period period = Period.between(date_now, date_random);
        int days = period.getDays();

        System.out.println(days);

    }
}
