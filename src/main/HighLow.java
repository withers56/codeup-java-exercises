package main;

import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        guessTheNumber(5);

    }

    public static void guessTheNumber (int attemptAmount) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) Math.ceil(Math.random() * 100);

        int userGuessedNumber = 0;
        int userAttempt = 0;

        do {

            if (userAttempt == attemptAmount){
                System.out.println("You ran out of attempts!");
                return;
            }

            userAttempt++;

            System.out.print("Guess the number!: ");
            userGuessedNumber = sc.nextInt();

            if (userGuessedNumber == randomNumber) {
                System.out.println("You did it!");
                System.out.println("It took you " + userAttempt + " attempts!");
            } else if (userGuessedNumber > randomNumber) {
                System.out.println("Lower!");
            } else System.out.println("Higher!");
        } while (userGuessedNumber != randomNumber);
    }
}
