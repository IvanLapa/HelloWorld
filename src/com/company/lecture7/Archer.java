package com.company.lecture7;

public class Archer extends Hero{
    public Archer (String a){
        super(a);
    }
    @Override
    public void attackEnemy() {
        System.out.println("Archer атакует врага");
    }
}
