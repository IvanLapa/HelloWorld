package com.companyJD1.lecture13;

public class Mission5 {
    public static void main(String[] args) {
        String string = "Java is the best from my discovery";
        int count=0;
        if (string.length()!=0) {
            count++;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Кол-во слов"+count);
    }
}
