package com.companyJD1.lecture3_loops;

/**Напишите программу, заносящую в массив первые 100 натуральных чисел,
 * делящихся на 13 или на 17, и печатающую его.
 */
public class FirstOneHundredNaturalNumbers {
    public static void main (String[] args){
        int[] array = new int[100];
        int number = 13;
        int counter = 0;
        int i=0;
        do {
            if(number%13==0 || number%17==0){
                array[i]=number;
                System.out.println(i+":"+array[i]+";");
                counter++;
                number++;
                i++;
            }number++;
        } while(
                counter!=100);
    }
}
