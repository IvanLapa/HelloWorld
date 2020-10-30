package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;

/**Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня.
 */

public class Mission11 implements TemporalAdjuster{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(TemporalAdjuster.add42days(date));
    }
}
