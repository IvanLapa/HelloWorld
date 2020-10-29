package com.companyJD1.lecture16_serialization;

import java.io.*;

/**Сравнить скорость чтения и записи 5 МБ символов при использовании классов
 * буфиризированого и не буфиризированого символьного ввода вывода.
 */

public class Mission1 {
    public static void main(String[] args)throws IOException {
        long start1 = System.currentTimeMillis();
        int char1 = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16.txt")));
        while ((char1 = br.read()) != -1) {
            bw.write((char) char1);
        }
        br.close();
        bw.close();
        long finish1 = System.currentTimeMillis();
        System.out.println("Buffered: " + (finish1 - start1) + " ms");
        long start2 = System.currentTimeMillis();
        int char2 = 0;
        Reader br2 = new FileReader("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16.txt");
        Writer bw2 = new FileWriter("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16.txt");
        while ((char2 = br2.read()) != -1) {
            bw2.write((char) char2);
        }
        br2.close();
        bw2.close();
        long finish2 = System.currentTimeMillis();
        System.out.println("No Buffered: " + (finish2 - start2) + " ms");
    }
}
