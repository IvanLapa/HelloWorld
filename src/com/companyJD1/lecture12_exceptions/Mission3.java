package com.companyJD1.lecture12_exceptions;

/**Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */

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
