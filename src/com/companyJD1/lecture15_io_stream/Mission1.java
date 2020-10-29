package com.companyJD1.lecture15_io_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**Задан файл с многострочным текстом.
 * Прочитать и вывести этот файл в консоль построчно.
 */


public class Mission1 {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File ("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15.txt");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
