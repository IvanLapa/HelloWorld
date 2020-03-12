package com.company.lecture7;

public class Warrior extends Hero {
    public Warrior (String a){
        super(a);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Warrior атакует врага");
    }
}
