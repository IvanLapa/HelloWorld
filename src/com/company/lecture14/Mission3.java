package com.company.lecture14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mission3 {
    public static void main(String[] args) {
        String str = "";
        Pattern pattern = Pattern.compile("<(.|\\n)*?>");
        Matcher matcher = pattern.matcher(str);
        str.replaceAll("<(.|\\n)*?>", "<p>");
    }
}
