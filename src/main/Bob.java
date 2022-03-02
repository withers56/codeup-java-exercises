package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ask Bob something!: ");
        String userInput = scanner.nextLine();

        System.out.println(userInput);


    }
}
