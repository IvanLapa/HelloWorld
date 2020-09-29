package com.companyJD1.lecture13_strings;

public class Mission2 {
    public static void main(String[] args) {
        String bad_smile = ":( :( :( :(";
        String happy_smile = bad_smile.replace(":(", ":)");
        System.out.println(happy_smile);
    }
}
