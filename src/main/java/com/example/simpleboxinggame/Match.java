package com.example.simpleboxinggame;

public class Match {

    Fighter fighter1;
    Fighter fighter2;

    int minWeight;
    int maxWeight;

    public Match(int minWeight, int maxWeight, Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    public void Run() {
        if (isCheck()) {
            boolean isFighter1Turn = Math.random() < 0.5;
            System.out.println("--NEW ROUND--");
            while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
                if(isFighter1Turn) {
                    this.fighter2.setHealth(this.fighter1.hit(this.fighter2));
                    System.out.println(this.fighter1.name + " hits!");
                    System.out.println(this.fighter2.name + " is health : " + this.fighter2.health);
                } else {
                    this.fighter1.setHealth(this.fighter2.hit(this.fighter1));
                    System.out.println(this.fighter2.name + " hits!");
                    System.out.println(this.fighter1.name + " is health : " + this.fighter1.health);
                }
                isFighter1Turn = !isFighter1Turn;
            }

            isWin();
        } else
            System.out.println("The weights of the players do not match.");
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

    void isWin() {
        if (this.fighter1.health == 0) {
            System.out.println(this.fighter2.name + " is winner!");
        } else {
            System.out.println(this.fighter1.name + " is winner!");
        }
    }
}




