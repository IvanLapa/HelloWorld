package com.companyJD1.lecture12_exceptions;

public class Mission3 {
    public static void main(String[] args) {
        try {
            throwExcaption();
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
    static void throwExcaption() throws MyException {
        throw new MyException();
    }
    private static class MyException extends Exception {
    }
}
