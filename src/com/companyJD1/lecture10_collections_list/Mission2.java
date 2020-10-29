package com.companyJD1.lecture10_collections_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/** Создать список оценок учеников с помощью ListIterator,
 * заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */
public class Mission2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        ListIterator<Integer> listIterator = list.listIterator();
        Random mark = new Random();
        for (int i = 0; i < 10; i++) {
            listIterator.add(mark.nextInt(10));
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        listIterator = list.listIterator();
        int max_mark = 0;
        while (listIterator.hasNext()) {
            Integer match_mark = listIterator.next();
            if (match_mark >= max_mark) {
                max_mark = match_mark;
            }
        }
        System.out.println(max_mark);
    }
}
