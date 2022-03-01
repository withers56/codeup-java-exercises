package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;

//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        int j = 100;
//
//        do {
//            System.out.println(j);
//
//            j -= 5;
//
//        }while (j >= -10);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        long k = 2;
//
//        do {
//            System.out.println(k);
//
//            k = k * k;
//        }while (k <= 1000000);

//        for (long i = 2; i <= 1000000 ; i = i * i) {
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++) {
//
//           if (i % 3 == 0 && i % 5 == 0){
//               System.out.println(i + ": FizzBuzz");
//           }
//           else if (i % 3 == 0){
//                System.out.println(i + ": fizz");
//            }
//            else if (i % 5 == 0){
//                System.out.println(i + ": buzz");
//            }
//            else System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);

//        System.out.print("What number would you like to go to?: ");
//        int userNumber = scanner.nextInt();
//        System.out.println("    Here is your table!");
//        System.out.println("|--------|----------|----------|");
//        System.out.println("| Number | Squared  | Cubed    |");
//        System.out.println("|--------|----------|----------|");
//
//
//        for (int i = 1; i <= userNumber; i++) {
//
//            int iSquared = i * i;
//            int iCubed = i * i * i;
//
//            System.out.printf("| %-7d|   %-7d|   %-7d|\n", i, iSquared, iCubed);
//        }
//        System.out.println("|--------|----------|----------|");

        boolean confirmation = true;

        do {

            System.out.print("Please enter a whole number grade: ");
            int grade = scanner.nextInt();

            if (grade >= 90) {
                System.out.print("A");
                if (grade > 95){
                    System.out.print("+");
                } else if (grade < 95){
                    System.out.print("-");
                }
                System.out.println();
            }
            else if (grade >= 80) {
                System.out.print("B");
                if (grade > 85){
                    System.out.print("+");
                } else if (grade < 85){
                    System.out.print("-");
                }
                System.out.println();
            }
            else if(grade >= 70) {
                System.out.print("C");
                if (grade > 75){
                    System.out.print("+");
                } else if (grade < 75){
                    System.out.print("-");
                }
                System.out.println();
            }
            else if(grade >= 60) {
                System.out.print("D");
                if (grade > 65){
                    System.out.print("+");
                } else if (grade < 65){
                    System.out.print("-");
                }
                System.out.println();
            }
            else System.out.println("F");

            System.out.print("Continue? [y/n]: ");
            String userInput = scanner.next();

            confirmation = userInput.equals("y");
        }while (confirmation);
    }
}

