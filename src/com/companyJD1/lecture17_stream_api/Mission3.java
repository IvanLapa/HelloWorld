package com.companyJD1.lecture17_stream_api;

import java.util.HashMap;
import java.util.Map;

public class Mission3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java lang", 1);
        map.put("perfect world", 2);
        map.put("Yamaha", 3);
        map.put("Bro", 4);
        int sum = map.entrySet()
                .stream()
                .filter(entry-> entry.getValue()!=null && entry.getKey()!=null && entry.getKey().length()<7)
                .mapToInt(Map.Entry:: getValue)
                .sum();
        System.out.println(sum);
    }
}
