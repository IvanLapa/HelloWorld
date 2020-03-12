package com.company.lecture5;
import java.math.BigDecimal;

public class MyBigDecimal {
    int first_arg;
    int second_arg;
    double first_arg_d;
    double second_arg_d;
    BigDecimal first_arg_b;
    BigDecimal second_arg_b;

    // конструкторы которе при инициализации принимает на вход 2 аргумента целого или вещественного типа
    public MyBigDecimal(int a, int b){
        this.first_arg = a;
        this.second_arg = b;
    }
    public MyBigDecimal(double a, double b){
        this.first_arg_d=a;
        this.second_arg_d=b;
    }
    public MyBigDecimal(int a, double b){
        this.first_arg = a;
        this.second_arg_d = b;
    }
    public MyBigDecimal( BigDecimal a, BigDecimal b){
        this.first_arg_b=a;
        this.second_arg_b=b;
    }
    public MyBigDecimal(double a, int b){
        this.first_arg_d=a;
        this.second_arg=b;
    }
    // методы возвращающие результат арифметических операций над заданными полями
    public int intSumm (){
        return this.first_arg+this.second_arg;
    }
    public double doubSumm(){
        return this.first_arg_d+this.second_arg_d;
    }
    public double intDoubSumm(){
        return this.first_arg+this.second_arg_d;
    }
    public double doubIntSumm(){
        return this.first_arg_d+this.second_arg;
    }
    // вход
    public static void main (String[] args){
        MyBigDecimal first = new MyBigDecimal(10,20.0);
        System.out.println(first.intDoubSumm());
     }
}
