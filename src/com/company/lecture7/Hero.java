package com.company.lecture7;

public class Hero {
    public String name;
    public Hero (String a){
        this.name=a;
    }
    public String getName(){
        return this.name;
    }
    public void attackEnemy(){
        System.out.println("Герой атакует врага");
    }
}