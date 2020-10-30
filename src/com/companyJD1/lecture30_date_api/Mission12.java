package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;

/**Написать свою реализацию интерфейса TemporalAdjuster,
 * которая бы изменяла дату на ближайшее (в днях) 1 января.
 */
public class Mission12 implements TemporalAdjuster{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(TemporalAdjuster.changeDate1stJanuary(date));
    }
}
