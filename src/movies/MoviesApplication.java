package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        MovieAppMethods get = new MovieAppMethods();
        boolean willContinue = true;

        Movie [] allMovies = MoviesArray.findAll();

        get.newMovie(allMovies, new Movie("test", "test"));

        do {

            get.menuList();

            int userChoiceNumber = input.getInt();

            if (userChoiceNumber == 0) {
                willContinue = false;
            }
            if (userChoiceNumber == 6) {
                String movieName = input.getString();
                String movieCategory = "";

                System.out.println("Which category? (enter num)");
                System.out.println("1. animated");
                System.out.println("2. horror");
                System.out.println("3. drama");
                System.out.println("4. scifi");

                int userChoice = input.getInt();

                if (userChoice == 1) {
                    movieCategory = "animated";
                }
                if (userChoice == 2) {
                    movieCategory = "horror";
                }
                if (userChoice == 3) {
                    movieCategory = "drama";
                }
                if (userChoice == 4) {
                    movieCategory = "scifi";
                }

                get.newMovie(allMovies, new Movie(movieName, movieCategory));
            }

            System.out.println();
            get.movieByCategory(allMovies, userChoiceNumber);

        } while (willContinue);
//        for (int i = 0; i < allMovies.length; i++) {
//
//            if ()
//            if (allMovies[i].getCategory().equalsIgnoreCase("drama")) {
//                System.out.printf("%s: %s\n", allMovies[i].getName(), allMovies[i].getCategory());
//            }
//        }

    }


}
