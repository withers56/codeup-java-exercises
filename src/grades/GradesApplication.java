package grades;

import main.ServerNameGenerator;
import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        ServerNameGenerator randomName = new ServerNameGenerator();
        Input input = new Input();

        String [] usernames = {randomName.getRandomName(), randomName.getRandomName(), randomName.getRandomName(), randomName.getRandomName()};


        double classAverage = 0;
        students.put(usernames[0], new Student("william"));
        students.put(usernames[1], new Student("bob"));
        students.put(usernames[2], new Student("jack"));
        students.put(usernames[3], new Student("kyle"));

        for (int i = 0; i < usernames.length; i++) {

            for (int j = 0; j < 3; j++) {
                double grade = Math.ceil(Math.random() * 40) + 60;
                students.get(usernames[i]).addGrade(grade);
            }
            classAverage += students.get(usernames[i]).getGradeAverage();
        }
        classAverage = classAverage / usernames.length;

        boolean userWillContinue = true;
        boolean runProgram = true;


        while (runProgram) {

            printMenu();

            int userMenuChoice = input.getInt(1, 3, "Enter 1, 2, or 3: ");

            if (userMenuChoice == 1){
                do {
                    printUsernames(students, usernames);


                    String userChoice = input.getString();
                    System.out.println(userChoice);

                    System.out.println("\nName: " + students.get(userChoice).getStudentName() + " -- Github username: " + userChoice);
                    System.out.printf("Grade average: %.4s\n", students.get(userChoice).getGradeAverage());
                    System.out.print("Grades: ");
                    students.get(userChoice).getStudentGrades();

                    System.out.println("Would you like to see another student?");

                    userWillContinue = input.yesNo();
                } while (userWillContinue);
            }

            if (userMenuChoice == 2) {
                System.out.printf("Class average: %.4s\n",classAverage);
            }

            if (userMenuChoice == 3) {
                csvReport(students, usernames);
            }





            if (input.yesNo("Exit program?: ")) {
                runProgram = false;
            }
        }
    }

    public static void printUsernames(HashMap<String, Student> students, String[] usernames) {
        System.out.println("Welcome!\n");
        System.out.println("Here are the Github usernames of our students!\n");
        System.out.print("|");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(" " + usernames[i] + " |");
        }

        System.out.println("\n\nWhat student would you like to see more information on?");
    }

    public static void csvReport(HashMap<String, Student> students, String[] usernames) {
        System.out.println("name,github_username,average");

        for (int i = 0; i < usernames.length; i++) {

            System.out.print(students.get(usernames[i]).getStudentName() + ",");
            System.out.print(usernames[i] + ",");
            System.out.printf("%.4s\n", students.get(usernames[i]).getGradeAverage());
        }
    }

    public static void printMenu() {
        System.out.println("1. View individual students.");
        System.out.println("2. View class average.");
        System.out.println("3. View csv report.");
    }


}
