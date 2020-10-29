package com.companyJD1.lecture12_exceptions;

/**Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */

public class Mission2 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            arr[2] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            arr[arr.length - 1] = 1;
        }
        System.out.println(arr[arr.length - 1]);
    }
}
