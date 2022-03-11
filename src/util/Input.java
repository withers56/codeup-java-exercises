package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner =  new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Input string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.print("Yes or no?: ");
        String yesOrNoString = scanner.nextLine().trim();

        return yesOrNoString.equalsIgnoreCase("Yes") || yesOrNoString.equalsIgnoreCase("y");
    }

    public int getInt (int min, int max) {

        while (true) {
            int userNum = getInt();

            if (min <= userNum && userNum <= max) {
                System.out.println("Valid!");
                return userNum;
            }
            System.out.println("Invalid.");
        }

    }

    public int getInt (int min, int max, String prompt) {
        System.out.printf("%s", prompt);

        while (true) {
            int userNum = getInt();

            if (min <= userNum && userNum <= max) {
                System.out.println("Valid!");
                return userNum;
            }
            System.out.println("Invalid.");
        }

    }

    public int getInt () {
        System.out.print("Enter a num: ");

        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                scanner.nextLine();
                return result;
            }
            System.out.println("Invalid input, try again.");
            scanner.nextLine();
        }
    }

    public double getDouble (double min, double max) {
        System.out.print("Enter a num between " + min + " and " + max + ": ");
        double userNum = scanner.nextDouble();

        if (min <= userNum && userNum <= max) {
            System.out.println("Valid!");
            return userNum;
        }

        System.out.println("Invalid.");
        return getDouble(min, max);
    }

    public double getDouble () {
        System.out.print("Enter a double num: ");
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}
