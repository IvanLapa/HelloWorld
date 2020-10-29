package com.companyJD1.lecture15_io_stream;

import java.io.*;

/**Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
 * Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */

public class Mission5 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10 + 255);
            try {
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15_5.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (int number : nums) {
                    oos.writeObject(number);
                }
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15_5.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int[]numsInput=new int[20];
           for (int i=0; i<numsInput.length; i++){
               numsInput[i]=(int)(ois.read());
            }
            fis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

