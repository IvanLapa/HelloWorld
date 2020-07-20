package com.companyJD1.lecture9;

public class ClassForTest {
    int timeInSec;
    int timeInMin;

    public ClassForTest(int timeInSec, int timeInMin) {
        this.timeInSec = timeInSec;
        this.timeInMin = timeInMin;
    }
    @Transaction
    public int calcTime(int a){
        int min = timeInMin;
        int sec = timeInSec;
        return ((min/60)+sec)*a;
    }
    public void printTime(int p){
        System.out.println(p);
    }
}
