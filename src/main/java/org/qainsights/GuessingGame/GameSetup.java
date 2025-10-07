package org.qainsights.GuessingGame;

public class GameSetup {
    private int numberOfRetries = 3;

    public int setupGame() {
        return numberOfRetries;
    }

    public int getCorrectAnswer() {
        return (int) (Math.random() * 5);
    }
}
