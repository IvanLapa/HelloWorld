package com.companyJD1.lecture13_strings;

public class Mission4 {
    public static void main(String[] args) {
        String first_name = "Ivan";
        String middle_mane = "Mihailovicn";
        String last_name = "Laptenok";

        String f_name = first_name.substring(0, 1);
        String m_mane = middle_mane.substring(0, 1);
        String l_mane = last_name.substring(0, 1);
        String full_name = l_mane + "." + f_name + "." + m_mane + ".";
        System.out.println(full_name.toUpperCase());
        }
    }



