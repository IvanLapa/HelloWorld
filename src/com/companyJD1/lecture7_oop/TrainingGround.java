package com.companyJD1.lecture7_oop;

public class TrainingGround {
    public static void main (String [] args){
        Hero hero_1 = new Mage("Invoker",150 );
        Hero hero_2 = new Archer("Windranger",800);
        Hero hero_3 = new Warrior("Axe", 250);
        Enemy enemy_1=new Enemy("Luk", 500);
        hero_1.attackEnemy(enemy_1);
    }
}

