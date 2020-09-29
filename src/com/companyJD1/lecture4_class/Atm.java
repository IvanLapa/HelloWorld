package com.companyJD1.lecture4_class;

import java.util.Scanner;

public class Atm {
    int value_money20;
    int value_money50;
    int value_money100;
    int sum_total;

    public void upValue20(int money) {
        this.value_money20 += money;
        sum_total += value_money20 * 20;
        return;
    }
    public void upValue50(int money) {
        this.value_money50 += money;
        this.sum_total += value_money50 * 50;
        return;
    }
    public void upValue100(int money) {
        this.value_money100 += money;
        this.sum_total += value_money100 * 100;
        return;
    }
    public Atm(int value_money20, int value_money50, int value_money100) {
        this.value_money20 = value_money20;
        this.value_money50 = value_money50;
        this.value_money100 = value_money100;
        this.sum_total = this.value_money20 * 20 + this.value_money50 * 50 + this.value_money100 * 100;
    }
    public boolean outputSum(int output_sum) {
        boolean flag = false;
        if (this.sum_total >= output_sum && output_sum != 0) {
            flag = true;
            if (output_sum <= 800 && output_sum>= 20 && output_sum != 30 && output_sum <= this.sum_total && output_sum % 10 == 0 ) {
                int money100 = output_sum / 100;
                if (output_sum - money100 * 100 != 60 && output_sum - money100 * 100 != 80) {
                    int money50 = (output_sum % 100) / 50;
                    int money20 = ((output_sum % 100) % 50) / 20;
                    int sum = money100 * 100 + money50 * 50 + money20 * 20;
                    if (output_sum == sum) {
                        System.out.println("100: " + money100 + "шт.\n" + "50: " + money50 + "шт.\n" + "20: " + money20 + "шт.\n");
                    } else {
                        System.out.println("Введите корректную сумму");
                    }
                }else {
                    int money20 = ((output_sum % 100) / 20);
                    System.out.println("100: " + money100 + "шт.\n" + "20: " + money20 + "шт.\n");
                }
            }
        }else {
            flag = false;
            System.out.println("Введите корректную сумму");
        }
        return flag;
    }
    public static void main (String[]args){
        Atm first_atm=new Atm(10,10,10);
        System.out.println("Введите сумму:");
        Scanner sc=new Scanner(System.in);
        boolean output_sum = first_atm.outputSum(sc.nextInt());
        System.out.println(output_sum);
    }
}
