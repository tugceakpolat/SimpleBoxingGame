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
            while (fighter1.health > 0 && fighter2.health > 0) {
                System.out.println("--NEW ROUND--");
                this.fighter2.health = this.fighter1.hit(this.fighter2);
                if (isWin())
                    break;

                this.fighter1.health = this.fighter2.hit(this.fighter1);
                if(isWin())
                    break;

                System.out.println(this.fighter1.name + " is health : " + this.fighter1.health);
                System.out.println(this.fighter2.name + " is health : " + this.fighter2.health);

            }
        } else
            System.out.println("The weights of the players do not match.");
    }

    boolean isCheck() {
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.fighter1.health == 0) {
            System.out.println(this.fighter2.name + " is winner!");
            return true;
        }
        if (this.fighter2.health == 0) {
            System.out.println(this.fighter1.name + " is winner!");
            return true;
        }
            return false;

        }
    }




