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
}
