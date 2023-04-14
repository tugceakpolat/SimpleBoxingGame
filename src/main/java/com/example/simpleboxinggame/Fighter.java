package com.example.simpleboxinggame;

public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
    }

    int hit (Fighter rival){
        System.out.println(this.name + " ==> " + rival.name +" "+ this.damage + " Damaged.");
        if (rival.isDodge()) {
            System.out.println(rival.name + " blocked damage.");
            System.out.println(" ---- ");
            return rival.health;
        }
        return rival.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

}
