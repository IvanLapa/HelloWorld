package com.companyJD1.lecture3_loops;

import java.util.Scanner;

/**Имеется целое число, определить является ли это число простым,
 * т.е. делится без остатка только на 1 и себя.
 */
public class IntegerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        while (!scan.hasNextInt()){
            System.out.println("Введите число: ");
            scan.next();
        }
        int n = scan.nextInt();
        int a=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                a++;
            }if(i!=n-1 && a==2){
                System.out.println(n+" не является простым числом");
                break;
            } else if(i==n-1 && a==1){
                System.out.println(n+" является простым числом");
                break;
            }
        }
    }
}