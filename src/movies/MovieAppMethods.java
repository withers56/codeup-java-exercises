package movies;

import util.Input;

public class MovieAppMethods {

    public void menuList() {
        System.out.println("\nWhat would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a new movie");
    }

    public void newMovie(Movie[] currentMovieArray, Movie newMovie) {
        Movie[] tempArray = new Movie[currentMovieArray.length];
        tempArray = currentMovieArray;
        tempArray[tempArray.length - 1] = newMovie;

    }

    public void movieByCategory(Movie[] movieList, int selector) {
        for (int i = 0; i < movieList.length; i++) {

            if (selector == 1) {
                System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
            }

            if (selector == 2) {
                if (movieList[i].getCategory().equalsIgnoreCase("animated")) {
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }

            if (selector == 3) {
                if (movieList[i].getCategory().equalsIgnoreCase("drama")) {
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }

            if (selector == 4) {
                if (movieList[i].getCategory().equalsIgnoreCase("horror")) {
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }
            if (selector == 5) {
                if (movieList[i].getCategory().equalsIgnoreCase("scifi")) {
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }
        }
    }

    public String movieName(Input input) {
        System.out.print("Enter the movies name: ");
        return input.getString();
    }

    public String movieCategory(Input input) {


        System.out.println("Which category? (enter num)");
        System.out.println("1. animated");
        System.out.println("2. horror");
        System.out.println("3. drama");
        System.out.println("4. scifi");

        int userChoice = input.getInt(1, 4);

        if (userChoice == 1) {
            return "animated";
        }
        if (userChoice == 2) {
            return "horror";
        }
        if (userChoice == 3) {
            return "drama";
        }
        if (userChoice == 4) {
            return "scifi";
        }
        return "";
    }
}
