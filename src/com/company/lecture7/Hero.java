package com.company.lecture7;

public abstract class Hero {
    public String name;
    public Hero(String a) {
        this.name = a;
    }
    public String getName() {
        return this.name;
    }
    public abstract void attackEnemy (Enemy enemy);
}