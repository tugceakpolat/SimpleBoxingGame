package com.example.simpleboxinggame;

public class Main {
    public static void main(String[] args) {


        Fighter fighter1 = new Fighter("Jack", 10, 100, 85,30);
        Fighter fighter2 = new Fighter("Samuel", 20, 85, 98,40);

        Match match = new Match(85,100,fighter1,fighter2);
        match.Run();


    }
}

