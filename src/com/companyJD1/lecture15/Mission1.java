package com.companyJD1.lecture15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mission1 {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File ("for_lecture15_can_delete");
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
