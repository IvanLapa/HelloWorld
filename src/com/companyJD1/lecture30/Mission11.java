package com.companyJD1.lecture30;

import java.time.LocalDate;

public class Mission11 implements TemporalAdjuster{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(TemporalAdjuster.add42days(date));
    }
}
