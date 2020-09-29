package com.companyJD1.lecture11_collection_set_map;
import java.util.*;

public class Mission1 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.print('\n');
        System.out.println("Количество уникальных целых чисел: " + countUnique(list));
    }

    private static int countUnique(List<Integer> list) {
        if (list.size() != 0) {
            Set<Integer> set = new HashSet<>(list);
            return set.size();
        } else return 0;

    }
}
