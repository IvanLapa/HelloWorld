package com.companyJD1.lecture11;
import java.util.*;


public class Mission2 {
    public static void main(String[] args) {
        Map<String, String> people_group1 = new HashMap<>();
        people_group1.put("Marty", "Stepp");
        people_group1.put("Stuart", "Reges");
        people_group1.put("Jessica", "Miller");
        people_group1.put("Hal", "Perkins");

        Map<String, String> people_group2 = new HashMap<>();
        people_group2.put("Kendrick", "Perkins");
        people_group2.put("Stuart", "Reges");
        people_group2.put("Bruce", "Reges");
        people_group2.put("Hal", "Perkins");
        System.out.println(isUnique(people_group1));
        System.out.println(isUnique(people_group2));
    }

    private static boolean isUnique(Map<String, String> people) {
        ArrayList<String> list = new ArrayList<>(people.values());
        Set<String> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}