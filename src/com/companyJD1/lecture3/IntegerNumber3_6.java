package com.companyJD1.lecture3;

import java.util.Scanner;

public class IntegerNumber3_6 {
    public static void main(String[] args) {
        System.out.println("Введите число больше 1:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number_dividers=0;
        for(int i=1; i<number; i++){
            if(number%i==0) {
                number_dividers++;
            }
        }
        if(number_dividers==1){
            System.out.println(number + " простое число");
        }else{
            System.out.println(number + " составное число");
        }
    }
}