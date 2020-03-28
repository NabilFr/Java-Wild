package com.company;

public abstract class Monster {

    private String name;
    private int damage;
    private int life;
    private String type = "type";

    @Override
    public String toString() {
        return name;
    }

    public Monster (String name, int damage, int life) {

        this.name = name;
        this.damage = damage;
        this.life = life;
        this.type = "normal";

    }

    //GETTERS



    public String getName () {
        return this.name;
    }

    public int getDamage () {
        return this.damage;
    }

    public int getLife () {
        return this.life;
    }

    public String getType(){
        return this.type;
    }

    //SETTERS

    public  void SetName (String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setType(String type) {this.type = type;}


    public abstract void takeHit (Monster ennemy);



}
