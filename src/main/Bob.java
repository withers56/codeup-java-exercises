package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean willContinue = true;

        while (willContinue){

            System.out.print("Ask Bob something!: ");
            String userInput = scanner.nextLine();

            System.out.println("You: " + userInput);

            if (userInput.endsWith("?")){
                System.out.println("Bob: Sure.");
            }
            else if (userInput.endsWith("!")){
                System.out.println("Bob: Whoa, chill out!");
            }
            else if (userInput.length() == 0){
                System.out.println("Bob: Fine, be that way!");
            }
            else System.out.println("Bob: Whatever.");


            System.out.println("Ask something else? [y/n]");
            String confirmation = scanner.next();

            if (confirmation.equals("n")){
                willContinue = false;
            }
        }
        System.out.print("Bob: Catch you later nerd!");
    }
}


