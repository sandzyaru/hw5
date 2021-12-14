package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boss();
        Hero[] heroes = createHeroes();
        for ( Hero hero:heroes) {
            System.out.println( hp+hero.getHeroHealth()+" " +damage+ hero.getHeroDamage()+" "+nameHero+hero.getHeroAttackType());
        }
    }

    public static String hp = "HP: ";
    public static String damage = "Damage: ";
    public static String nameHero = "Hero: ";

    public static void boss() {
        Boss boss = new Boss();
        boss.setBossHealth(1500);
        boss.setBossDamage(50);
        boss.setBossDefence("Щит");
        System.out.println(hp + boss.getBossHealth());
        System.out.println(damage + boss.getBossDamage());
        System.out.println("Defence: " + boss.getBossDefence());
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 50, "Magic");
        Hero hero2 = new Hero(270, 40, "Physical");
        Hero hero3 = new Hero(1500, 1);
        hero3.HeroAttackType("Golem");
        Hero hero[] = {hero1, hero2, hero3};


        return hero;
    }
}
