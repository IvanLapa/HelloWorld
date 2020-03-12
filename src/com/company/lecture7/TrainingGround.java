package com.company.lecture7;

public class TrainingGround {
    public static void main (String [] args){
        Hero first_hero = new Hero("ГЕРОЙ");
        first_hero.getName();
        first_hero.attackEnemy();
        // Тестирование создания героев различных классов и их атаки в классе
        Warrior first_warrior = new Warrior("ВОИН");
        System.out.println(first_warrior.getName());
        first_warrior.attackEnemy();

        Mage first_mage = new Mage("МАГ");
        System.out.println(first_mage.getName());
        first_mage.attackEnemy();

        Archer first_archer = new Archer("ЛУЧНИК");
        System.out.println(first_archer.getName());
        first_archer.attackEnemy();
    }
}
