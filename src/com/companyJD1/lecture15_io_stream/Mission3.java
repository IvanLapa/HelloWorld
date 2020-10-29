package com.companyJD1.lecture15_io_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Задан файл с текстом, найти и вывести в консоль все слова,
 * для которых последняя буква одного слова совпадает с первой буквой следующего слова.
 */


public class Mission3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15.txt");
        Scanner sc = new Scanner(file);
        String line;
        while (sc.hasNext()) {
            Pattern pattern = Pattern.compile("\\b([\\w])\\w*\\1\\b");
            Matcher matcher = pattern.matcher(sc.nextLine());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
