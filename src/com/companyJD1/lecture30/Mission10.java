package com.companyJD1.lecture30;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mission10 {
    public static void main(String[] args) {
        LocalDate date_now = LocalDate.now();
        LocalDate date_random = LocalDate.of(2020,6,25);
        LocalDateTime todayMidnight = date_now.atStartOfDay();
        LocalDateTime localDateMidnight = date_random.atStartOfDay();

        Duration durationOfSeconds = Duration.between(todayMidnight, localDateMidnight);
        System.out.println(durationOfSeconds.toSeconds());

    }
}
