package org.qainsights.GuessingGame;

public class GameDriver {
    static void main(String[] args) {
        GameSetup game = new GameSetup();
        int retries = game.setupGame();
        int correctAnswer = game.getCorrectAnswer();
        int getNumber;
        int maxRetries = 0;

        System.out.println("Retries " + retries + " Correct Answer " + correctAnswer);

        GameHelper helper = new GameHelper();

        boolean isSuccess = false;
        while (!isSuccess && maxRetries < retries) {
            getNumber = helper.getNumber();
            if (getNumber == correctAnswer) {
                System.out.println("Success");
                isSuccess = true;
            }
            maxRetries++;
        }
        if (!isSuccess) System.out.println("Game Over");

    }
}
