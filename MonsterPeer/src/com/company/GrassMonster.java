package com.company;

public class GrassMonster extends Monster{



    public GrassMonster (String name, int damage, int life){

        super(name,damage,life);
        this.setType("grass");

    }



    @Override
    public void takeHit(Monster ennemy) {
        if (ennemy.getType().equals("water")){
            this.setLife(this.getLife() - (ennemy.getDamage()/2));
        }
        else if (ennemy.getType().equals("fire")) {
            this.setLife(this.getLife() - (ennemy.getDamage()*2));
        }
        else{
            this.setLife(this.getLife() - ennemy.getDamage());
        }

        if (this.getLife() > 0) {
            System.out.println(ennemy.getName() + " attack !");
            System.out.println(this.getName() + " has " + this.getLife() + " points remaining.");
        }
        else {
            System.out.println(ennemy.getName() + " attack !");
            System.out.println(this.getName() + " is K.O!");
        }
    }
}
