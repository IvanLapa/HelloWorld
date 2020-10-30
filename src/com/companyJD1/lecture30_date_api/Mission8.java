package com.companyJD1.lecture30_date_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mission8 {
    public static void main(String[] args) {
        String date_string = "26-03-2014";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(LocalDate.parse(date_string, formatter));
    }
}
