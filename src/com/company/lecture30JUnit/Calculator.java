package com.company.lecture30JUnit;

import java.util.Objects;

public class Calculator<T extends Number> {
    private T arg1;
    private T arg2;
    public void setArg1(T arg1){
        this.arg1=arg1;
    }
    public void setArg2(T arg2){
        this.arg2=arg2;
    }
    public T getArg1 (){
        return arg1;
    }
    public T getArg2 (){
        return arg2;
    }
    public Calculator (T arg1, T arg2){
        if(Objects.isNull(arg1)||Objects.isNull(arg2)){
            throw new IllegalArgumentException("One of arg is null");
        }
        this.arg1=arg1;
        this.arg2=arg2;
    }
    public int add(){
        return arg1.intValue()+arg2.intValue();
    }
    public int minus(){
        return arg1.intValue()-arg2.intValue();
    }
}
