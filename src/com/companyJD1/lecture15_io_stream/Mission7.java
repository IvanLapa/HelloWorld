package com.companyJD1.lecture15_io_stream;

import java.io.*;

/**Задан файл с java-кодом. Прочитать текст программы из файла и записать
 * в другой файл в обратном порядке символы каждой строки.
 */

public class Mission7 {
    public static void main(String[] args) {
        File fileRead = new File("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15_7_read.txt");
        File fileWrite = new File("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15_7_write.txt");
        reverse(fileRead, fileWrite);
    }

    private static void reverse(File mainFile, File reverseFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(mainFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(reverseFile));
            String line;
            while ((line = reader.readLine()) != null) {
                for (int i = line.length() - 1; i >= 0; i--) {
                    writer.write(line.charAt(i));
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
