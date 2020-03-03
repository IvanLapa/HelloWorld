package com.company.lecture2;

import java.util.Scanner;

public class MoneySwitch2_2 {
    public static void main (String[] args){
        System.out.println("Введите сумму денег в рублях:");
        Scanner sc = new Scanner(System.in);
        int sum_money = sc.nextInt();
        int result1 = sum_money%10;
        int result2 = sum_money%100;
        if (result2 >= 11 && result2<=19){
            System.out.println(sum_money + " " + "рублей");
        }   else {
            switch (result1) {
                case 0:
                    System.out.println(sum_money + " " + "рублей");
                    break;
                case 1:
                    System.out.println(sum_money + " " + "рубль");
                    break;
                case 2:
                    System.out.println(sum_money + " " + "рубля");
                    break;
                case 3:
                    System.out.println(sum_money + " " + "рубля");
                    break;
                case 4:
                    System.out.println(sum_money + " " + "рубля");
                    break;
                case 5:
                    System.out.println(sum_money + " " + "рублей");
                    break;
                case 6:
                    System.out.println(sum_money + " " + "рублей");
                    break;
                case 7:
                    System.out.println(sum_money + " " + "рублей");
                    break;
                case 8:
                    System.out.println(sum_money + " " + "рублей");
                    break;
                case 9:
                    System.out.println(sum_money + " " + "рублей");
                    break;
                default:
                    System.out.println("Пожалуйста, введите корректную сумму");
            }
        }
    }
}
