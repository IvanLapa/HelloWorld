package com.company.lecture2;

import java.util.Scanner;

public class lecture2moneySwitch {
    public static void main (String[] args){
        System.out.println("Введите сумму денег в рублях:");
        Scanner sc = new Scanner(System.in);
        int sum_money = sc.nextInt();
        int type_result1 = sum_money%10;
        if (sum_money>10 && sum_money<19){
            System.out.println(sum_money + " " + "рублей");
        }   else {
            switch (type_result1) {
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
                    System.out.println(sum_money + " " + "ytn");
            }
        }
    }
}
