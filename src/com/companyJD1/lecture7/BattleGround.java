package com.companyJD1.lecture7;

public class BattleGround {
    public static void main (String [] args){
        Hero hero1 = new Mage ("Ivan");
        Enemy enemy = new Enemy ("San9", 100);
        hero1.attackEnemy(enemy);
    }
}
