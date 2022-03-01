package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);

//        System.out.printf("The value of pi is approximately %s", pi);
//
//        System.out.print("\nEnter a integar: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        System.out.println("Enter 3 words.");
//        String firstWordInput = scanner.next();
//        String secondWordInput = scanner.next();
//        String thirdWordInput = scanner.next();
//
//        System.out.println(firstWordInput + " " + secondWordInput + " " + thirdWordInput);

//        System.out.println("Enter a sentence");
//        String sentenceInput = scanner.nextLine();
//
//        System.out.println(sentenceInput);

        System.out.print("Enter width of room : ");
        double roomWidth = Double.parseDouble(scanner.nextLine());
        System.out.print("\nEnter Length of room: ");
        double roomLength = Double.parseDouble(scanner.nextLine());

        System.out.println("The area of the room is: " + (roomLength * roomWidth));
        System.out.println("The perimeter of the room is: " + ((roomLength * 2) + (roomWidth * 2)));
    }
}
