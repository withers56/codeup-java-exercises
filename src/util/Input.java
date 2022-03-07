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
}
