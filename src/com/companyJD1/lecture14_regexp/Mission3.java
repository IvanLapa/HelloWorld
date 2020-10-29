package com.companyJD1.lecture14_regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Написать программу, выполняющую поиск в строке всех тегов абзацев,
 * в т.ч. тех, у которых есть параметры,
 * например <p id ="p1">, и замену их на простые теги абзацев <p>.
 */

public class Mission3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Pattern pattern = Pattern.compile("<(.|\\n)*?>");
        Matcher matcher = pattern.matcher(str);
        str.replaceAll("<(.|\\n)*?>", "<p>");
    }
}
