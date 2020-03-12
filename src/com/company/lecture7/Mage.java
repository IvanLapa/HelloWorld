package com.company.lecture7;

public class Mage extends Hero{
    public Mage (String a){
        super(a);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Mage атакует врага");
    }
}

