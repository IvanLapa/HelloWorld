package com.company.lecture30;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public interface TemporalAdjuster {

    static LocalDate add42days(LocalDate today) {
        return today.plus(42, ChronoUnit.DAYS);
    }
    static LocalDate changeDate1stJanuary(LocalDate today) {
        if (today.getDayOfYear() < 183) {
            return firstJanOfThisYear(today);
        } else return firstJanOfNextYear(today);
    }
    private static LocalDate firstJanOfThisYear(LocalDate today) {
        int todayIsDay = today.getDayOfYear();
        return today.minus(todayIsDay - 1, ChronoUnit.DAYS);
    }
    private static LocalDate firstJanOfNextYear(LocalDate today) {
        int daysInYear = today.lengthOfYear();
        int todayIsDay = today.getDayOfYear();
        int leftDays = daysInYear - todayIsDay;
        return today.plus(leftDays + 1, ChronoUnit.DAYS);

    }
}
