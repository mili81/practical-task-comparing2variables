package com.company;

public class Assignment16 {
    public static void main(String[] args) {

        displayHighScorePosition("Edijs ", calculateHighScorePosition(499));
    }

    public static void displayHighScorePosition(String playerName, int positionInHighScore) {
        System.out.println(playerName + "managed to get into a position "
                + positionInHighScore + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) return 1;
        else if (score >= 500 && score < 1000) return 2;
        else if (score >= 100 && score < 500) return 3;
        else return 4;
    }
}


