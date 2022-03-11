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

        students.put(usernames[0], new Student("william"));
        students.put(usernames[1], new Student("bob"));
        students.put(usernames[2], new Student("jack"));
        students.put(usernames[3], new Student("kyle"));

        for (int i = 0; i < usernames.length; i++) {

            for (int j = 0; j < 3; j++) {
                students.get(usernames[i]).addGrade(Math.ceil(Math.random() * 40) + 60);
            }
        }


        boolean userWillContinue = true;

        do {
            System.out.println("Welcome!\n");
            System.out.println("Here are the Github usernames of our students!\n");
            System.out.print("|");
            for (int i = 0; i < students.size(); i++) {
                System.out.print(" " + usernames[i] + " |");
            }
            System.out.println("\n\nWhat student would you like to see more information on?");

            String userChoice = input.getString();
            System.out.println(userChoice);

            System.out.println("\nName: " + students.get(userChoice).getStudentName() + " -- Github username: " + userChoice);
            System.out.printf("Grade average: %.4s\n\n", students.get(userChoice).getGradeAverage());

            System.out.println("Would you like to see another student?");

            userWillContinue = input.yesNo();
        } while (userWillContinue);
    }


}
