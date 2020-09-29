package com.companyJD1.lecture10_collections_list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Mission1 {
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
        while (listIterator.hasNext()) {
            Integer match_mark = (Integer) listIterator.next();
            if (match_mark < 7) {
                listIterator.remove();
            }
        }
        for (Integer x : list) {
            System.out.print(x + " ");
        }
    }
}
