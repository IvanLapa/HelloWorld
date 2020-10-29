package com.companyJD1.lecture15_io_stream;

import java.io.File;
import java.util.Date;

/**Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
 * Для этого использовать рекурсию.
 */

public class Mission6 {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture15_io_stream\\resources\\for_lecture15_6.txt");
        getDirectory(directory);
    }

    private static void getDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] array = directory.listFiles();
            for (int i = 0; i < array.length; i++) {
                Date date = new Date(array[i].lastModified());
                System.out.print("\n" + array[i].getPath() + " \t| " + array[i].length() + "\t| " + date.toString());
            }
            for (File x : array) {
                getDirectory(x);
            }
        }
    }
}
