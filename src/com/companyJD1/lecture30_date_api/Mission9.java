package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;
import java.time.Period;

/**Создать объект LocalDate, представляющий собой сегодняшнюю дату.
 * Создать объект LocalDate, представляющий собой дату 25.06.2020.
 * Используя созданные объекты, найти количество дней между этими двумя датами.
 */

public class Mission9 {
    public static void main(String[] args) {
        LocalDate date_now = LocalDate.now();
        LocalDate date_random = LocalDate.of(2020,6,25);

        Period period = Period.between(date_now, date_random);
        int days = period.getDays();

        System.out.println(days);
    }
}
