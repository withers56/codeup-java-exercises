package main;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(add(2, 3));
        System.out.println(subtract(3, 7));
        System.out.println(multiply(5, 5));
        System.out.println(bonusMultiply(5, 5));
        System.out.println(divide(4, 2));
        System.out.println(modulus(4, 2));

        System.out.println(getInteger(1, 10));

        factorial();
        rollTheDice();
        guessTheNumber(5);

    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract (double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply (double num1, double num2) {
        return num1 * num2;
    }
    public static double bonusMultiply (double num1, double num2) {
        double result = 0;
        for (int i = 0; i < num2; i++) {
            result = result + num1;
        }
        return result;
    }
    public static double divide (double num1, double num2) {
        return num1 / num2;
    }
    public static int modulus (int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a num between " + min + " and " + max + ": ");
        int userNum = scanner.nextInt();

        if (min <= userNum && userNum <= max) {
            System.out.println("Valid!");
            return userNum;
        }

        System.out.println("Invalid.");
        return getInteger(min, max);
    }

    public static void factorial () {
        Scanner scanner = new Scanner(System.in);
         int userNum = getInteger(1, 10);
        System.out.println("Your number: " + userNum);

        for (int i = 1; i <= userNum; i++) {
            int total = 1;
            System.out.printf("%s! = ", i);
            for (int j = 1; j <= i; j++) {
                total *= j;

                if (j == i) {
                    System.out.print(j);
                } else System.out.printf("%s x ", j);
            }
            System.out.printf(" = %s\n", total);
        }
    }

    public static void rollTheDice () {
        Scanner scanner = new Scanner(System.in);

        boolean userPickSides = true;

        do {
            System.out.print("How many sides are on each dice?: ");
            int numberOfSides = scanner.nextInt();
            String scannerBufferCatch = scanner.nextLine();

            boolean userRoll = true;

            do {
                System.out.println("First die: " + (int) Math.ceil(Math.random() * numberOfSides));
                System.out.println("Second die: " + (int) Math.ceil(Math.random() * numberOfSides));

                System.out.println("Re-roll? (y/n)");
                String userReRoll = scanner.nextLine();

                if (!(userReRoll.equalsIgnoreCase("y"))){
                    userRoll = false;
                }
            } while (userRoll);

            System.out.println("Would you like to Use different dice? (y/n)");
            String userRePickSides = scanner.nextLine();

            if (!(userRePickSides.equalsIgnoreCase("y"))) {
                userPickSides = false;
            }

        } while (userPickSides);

        System.out.print("Have a nice day!");
    }

    public static void guessTheNumber (int attemptAmount) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) Math.ceil(Math.random() * 1000);

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
