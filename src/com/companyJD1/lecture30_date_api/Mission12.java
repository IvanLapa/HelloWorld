package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;

public class Mission12 implements TemporalAdjuster{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(TemporalAdjuster.changeDate1stJanuary(date));
    }
}
