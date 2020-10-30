package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;

/**Создать объект класса LocalDate, представляющий собой дату 25.06.2020.
 * Вывести полученную дату в консоль.
 */

public class Mission5 {
    public static void main(String[] args) {
    LocalDate date = LocalDate.of(2020,6,26);
        System.out.println(date);
    }
}
