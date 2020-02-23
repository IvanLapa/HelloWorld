package com.company.lecture2;

import java.util.Scanner;

public class Lecture2money {
    public static void main(String[] args) {
        System.out.println("Введите сумму денег в рублях:");
        Scanner sc = new Scanner(System.in);
        int sum_money = sc.nextInt();
        int result = sum_money % 10;
        int limit = 110;
        if (sum_money==0 || result== 0) {
            System.out.println(sum_money + " " + "рублей");
        }   else if (sum_money == 1 || result == 1 && sum_money>11) {
            System.out.println(sum_money + " " + "рубль");
        }   else if (sum_money>=11 && sum_money<=20) {
            System.out.println(sum_money + " " + "рублей");
        }   else if (sum_money>=2 && sum_money<=4 || result>=2 && result<=4) {
            System.out.println(sum_money + " " + "рубля");
        }   else if (sum_money>=5 && sum_money<=9 || result>=5){
            System.out.println(sum_money + " " + "рублей");
        }   else {
            System.out.println("Пожалуйста, введите корректную сумму");
        }
    }
}
