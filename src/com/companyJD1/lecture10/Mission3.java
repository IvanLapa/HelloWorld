package com.companyJD1.lecture10;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Mission3 {
    public static void main(String[] args) {
        List<Students> students_list = new ArrayList<>();
        students_list.add(new Students("Student1"));
        students_list.add(new Students("Student2"));
        students_list.add(new Students("Student3"));
        students_list.add(new Students("Student4"));
        ListIterator<Students> listIterator = students_list.listIterator();

        for(int i=4-1;i>=0;i--){
            System.out.println(students_list.get(i).getName());
        }

        while (listIterator.hasNext()) {
            listIterator.next();
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().getName());
        }

    }
}

class Students {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
