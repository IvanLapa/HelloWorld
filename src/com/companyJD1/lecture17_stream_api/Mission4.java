package com.companyJD1.lecture17_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**Дан список целых чисел, вывести строку,
 * представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}.
 * Результирующая строка: "52421".
 */

public class Mission4 {
    public static void main(String[] args) {
            List<Integer> list = Arrays.asList(5,2,4,2,1);

            String res = list.stream()
                    .filter(Objects::nonNull)
                    .map(Object::toString)
                    .collect(Collectors.joining());

            System.out.println("\""+ res +"\"");
    }
}
