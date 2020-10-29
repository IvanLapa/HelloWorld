package com.companyJD1.lecture11_collection_set_map;

import java.util.*;

/**Написать метод countUnique, который принимает целочисленный список
 * в качестве параметра и возвращает количество уникальных целых чисел в этом списке.
 * При получении пустого списка метод должен возвращать 0.
 * Пример:
 * [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
 */

public class Mission1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 10; i++) {
            list.add(random.nextInt(10));
        }
        for (Integer x : list) {
            System.out.print(x + ";");
        }
        System.out.println();
        System.out.println("Количество уникальных целых чисел:" + countUnique(list));
    }

    private static int countUnique(ArrayList<Integer> list) {
        if (list.size() != 0) {
            Set<Integer> set = new HashSet<>(list);
            return set.size();
        } else return 0;
    }
}
