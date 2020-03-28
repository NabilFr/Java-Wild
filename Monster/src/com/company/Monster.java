package com.company;

public class Monster {

    private String name;
    private int damage;
    private int life;

    public Monster(String name, int damage, int life){
        this.name = name;
        this.damage = damage;
        this.life = life;
    }

    //Getters
    public String getName () {
        return this.name;
    }

    public int getDamage () {
        return this.damage;
    }

    public int getLife() {
        return this.life;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String takeHit (int damage){
        this.life = this.life - damage;
        return this.name  + " has " + this.life + "points remaining.";
    }
}
