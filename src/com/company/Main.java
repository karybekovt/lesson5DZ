package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(1000);
        boss.setBossDamage(50);
        boss.setBossDefenseType("Средний");
        System.out.println("Здоровье Босса: " + boss.getBossHealth());
        System.out.println("Сила Босса: " + boss.getBossDamage());
        System.out.println("Тип защиты Босса: " + boss.getBossDefenseType());
    }
}

