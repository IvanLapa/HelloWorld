package com.company.lecture15;

import java.io.*;

public class Mission5 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10 + 255);
            try {
                FileOutputStream fos = new FileOutputStream("for_lecture15_5_can_delete.bin");
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
            FileInputStream fis = new FileInputStream("for_lecture15_5_can_delete.bin");
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

