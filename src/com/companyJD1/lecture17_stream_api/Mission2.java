package com.companyJD1.lecture17_stream_api;

import java.util.Arrays;
import java.util.List;

/**Дан список строк.
 * Найти количество уникальных строк длиной более 8 символов.
 */

public class Mission2 {
    public static void main(String[] args) {

    List<String> string_list = Arrays.asList("Hello Ivan", "world is mine", "hello", "Ivan");

    long count = string_list.stream()
            .filter(str->str.length()>8)
            .distinct()
            .count();

    System.out.println(count);
    }
}
