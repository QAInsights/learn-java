package org.qainsights.guessinggame;

import java.util.Scanner;

public class GameHelper {

    public int getNumber() {
        System.out.println("Enter a number: ");
        try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextInt();
        }
    }
}
