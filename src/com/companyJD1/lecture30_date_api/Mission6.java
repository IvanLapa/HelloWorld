package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;

/**Создать объект LocalDate, представляющий собой сегодняшнюю дату.
 * Используя этот объект, создать другой объект LocalTime, представляющий собой
 * дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.
 */

public class Mission6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate plus3Months = date.plusMonths(3);
        System.out.println(plus3Months);
    }
}
