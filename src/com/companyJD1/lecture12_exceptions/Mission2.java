package com.companyJD1.lecture12_exceptions;

public class Mission2 {
    public static void main(String[] args) {
        int[] mission = new int[3];
        try{
            mission[4]=45;
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива");
        }
    }
}