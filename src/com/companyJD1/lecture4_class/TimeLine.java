package com.companyJD1.lecture4_class;

import java.util.Scanner;

/**Создать класс, описывающий промежуток времени.
 * Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами.
 * Создать метод для получения полного количества секунд в объекте
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды по отдельности.
 * Создать метод для вывода данных.
 * Написать программу для тестирования возможностей класса.
 */

public class TimeLine {
    TimeLine(int seconds) {
        String output = transferToHoursMinSec(seconds);
        dataOutput(output);
    }

    TimeLine(int sec, int min, int hours) {
        String output = transferToHoursMinSec(transferToSeconds(sec, min, hours));
        dataOutput(output);
    }

    static String transferToHoursMinSec(int seconds) {
        int hours = seconds / 3600;
        int min = (seconds - hours * 3600) / 60;
        int sec = (seconds - hours * 3600 - min * 60);
        String output = hours + ":" + min + ":" + sec;
        return output;
    }

    static int transferToSeconds(int sec, int min, int hours) {
        return sec + min * 60 + hours * 3600;
    }

    static void dataOutput(String HourMinSec) {
        System.out.println(HourMinSec);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Выберите формат ввода данных:");
        System.out.println("1 - Ввод только секунд");
        System.out.println("2 - Ввод в формате секунды,минуты,часы");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку");
                scan.next();
            }
            n = scan.nextInt();
        } while (n <= 0 || n >= 3);
        if (n == 1) {
            int seconds;
            do {
                System.out.println("Введите секунды");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                seconds = scan.nextInt();
            } while (seconds < 0);
            TimeLine formatSeconds = new TimeLine(seconds);
        }
        if (n == 2) {
            int sec;
            int min;
            int hours;
            do {
                System.out.println("Введите секунды");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                sec = scan.nextInt();
            } while (sec < 0);
            do {
                System.out.println("Введите минуты");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                min = scan.nextInt();
            } while (min < 0);
            do {
                System.out.println("Введите часы");
                while (!scan.hasNextInt()) {
                    System.out.println("Некорректный ввод, повторите попытку");
                    scan.next();
                }
                hours = scan.nextInt();
            } while (hours < 0);
            TimeLine formatFull = new TimeLine(sec, min, hours);
        }
    }
}