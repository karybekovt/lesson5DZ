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
        creatHeroes();
    }

    public static void creatHeroes() {
        Hero hero1 = new Hero(300, 50, "Супер сильный");
        Hero hero2 = new Hero(200, 30, "Супер быстрый");
        Hero hero3 = new Hero(500, 20);
        int hero1Health = hero1.getHeroHealth();
        int hero2Health = hero2.getHeroHealth();
        int hero3Health = hero3.getHeroHealth();

        int hero1Damage = hero1.getHeroDamage();
        int hero2Damage = hero2.getHeroDamage();
        int hero3Damage = hero3.getHeroDamage();

        String hero1SuperPower = hero1.getHeroSuperPower();
        String hero2SuperPower = hero2.getHeroSuperPower();
        String hero3SuperPower = hero3.getHeroSuperPower();

        int[] heroesHealth = {hero1Health, hero2Health, hero3Health};
        int[] heroesDamage = {hero1Damage, hero2Damage, hero3Damage};
        String[] heroesSuperPowers = {hero1SuperPower, hero2SuperPower, hero3SuperPower};
        String[] heroesHealthName = {"Здоровье Силача", "Здоровье Шустрика", "Здоровье Голема"};
        String[] heroesDamageName = {"Мошь Силача", "Мощь Шустрика", "Мощь Голема"};
        String[] heroesSuperPowersName = {"Суперсила Силача", "Суперсила Шустрика", "Суперсила Голема"};
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesHealthName[i] + ": " + heroesHealth[i]);
            System.out.println(heroesDamageName[i] + ": " + heroesDamage[i]);
            if (i == 2)
                continue;
            System.out.println(heroesSuperPowersName[i] + ": " + heroesSuperPowers[i]);
        }
        }
    }

