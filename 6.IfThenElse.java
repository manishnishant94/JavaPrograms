package com.nishantkumar;

public class Main {

    public static void main(String[] args) {

        boolean gameover = true;
        int score =1000;
        int levelCompleted = 3;
        int bonus = 40;

        if (gameover){
            int totalScore = score + (bonus * levelCompleted);
            System.out.println(totalScore);
        }

         score =10000;
        levelCompleted = 2;
         bonus = 50;

        if (gameover){
            int totalScore = score + (bonus * levelCompleted);
            System.out.println(totalScore);
        }
    }
}
