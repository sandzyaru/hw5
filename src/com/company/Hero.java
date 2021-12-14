package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroAttackType;


    public Hero() {
    }

    public Hero(int heroHealth, int heroDamage, String heroAttackType) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroAttackType = heroAttackType;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroAttackType() {
        return heroAttackType;
    }

    public void HeroAttackType(String heroAttackType) {
        this.heroAttackType=heroAttackType;
    }

    public void HeroAttackType() {
    }
}


