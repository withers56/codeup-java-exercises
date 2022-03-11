package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        MovieAppMethods get = new MovieAppMethods();
        Movie [] allMovies = MoviesArray.findAll();

        boolean willContinue = true;

        do {

            get.menuList();

            int userChoiceNumber = input.getInt(0, 6);

            if (userChoiceNumber == 0) {
                willContinue = false;
            }
            if (userChoiceNumber == 6) {
                get.newMovie(allMovies, new Movie(get.movieName(input), get.movieCategory(input)));
            }

            System.out.println();
            get.movieByCategory(allMovies, userChoiceNumber);

        } while (willContinue);
    }
}
