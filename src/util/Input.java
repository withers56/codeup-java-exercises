package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Input string: ");
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public boolean yesNo(){
        System.out.print("Yes or no?: ");
        String yesOrNoString = scanner.nextLine().trim();

        return yesOrNoString.equalsIgnoreCase("Yes") || yesOrNoString.equalsIgnoreCase("y");
    }

    public int getInt (int min, int max) {
        System.out.print("Enter a num between " + min + " and " + max + ": ");
        int userNum = scanner.nextInt();

        if (min <= userNum && userNum <= max) {
            System.out.println("Valid!");
            return userNum;
        }

        System.out.println("Invalid.");
        return getInt(min, max);
    }

    public int getInt () {
        System.out.print("Enter a num: ");
        return scanner.nextInt();
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
}
