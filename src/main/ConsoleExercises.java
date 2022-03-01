package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");

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
        double roomWidth = scanner.nextDouble();
        System.out.print("Enter Length of room: ");
        double roomLength = scanner.nextDouble();

        double roomArea = roomLength * roomWidth;
        double roomPerimeter = (roomLength * 2) + (roomWidth * 2);

        System.out.printf("The area of the room is: %.2f\n", roomArea);
        System.out.printf("The perimeter of the room is: %.2f", roomPerimeter);

        scanner.close();
    }
}
