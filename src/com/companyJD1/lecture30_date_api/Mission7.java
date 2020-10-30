package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**Создать объект LocalDate, представляющий собой сегодняшнюю дату.
 * Преобразовать дату в строку вида "05.05.2017". Вывести эту строку в консоль.
 */

public class Mission7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        String date_str = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(date_str);
    }
}
