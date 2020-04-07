package com.company.lecture16;

import java.io.*;

public class Mission1 {
    public static void main(String[] args)throws IOException {
        long start1 = System.currentTimeMillis();
        int char1 = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("for_lecture16_can_delete")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("for_lecture16_can_delete")));
        while ((char1 = br.read()) != -1) {
            bw.write((char) char1);
        }
        br.close();
        bw.close();
        long finish1 = System.currentTimeMillis();
        System.out.println("Buffered: " + (finish1 - start1) + " ms");
        long start2 = System.currentTimeMillis();
        int char2 = 0;
        Reader br2 = new FileReader("for_lecture16_can_delete");
        Writer bw2 = new FileWriter("for_lecture16_can_delete");
        while ((char2 = br2.read()) != -1) {
            bw2.write((char) char2);
        }
        br2.close();
        bw2.close();
        long finish2 = System.currentTimeMillis();
        System.out.println("No Buffered: " + (finish2 - start2) + " ms");
    }
}
