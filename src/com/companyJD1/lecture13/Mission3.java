package com.companyJD1.lecture13;

public class Mission3 {
    public static boolean is_the_first_word_same (String string, String word){
         return string.startsWith(word)&&string.endsWith(word);
    }
    public static void main(String[] args) {
        String string = "Java is the best from my discovery";
        String word = "Java";
        boolean x = is_the_first_word_same (string, word);
    }
}
// почему если is_the_first_word_same не статический - бьет ошибку?????


