package movies;

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

    public void newMovie(Movie [] currentMovieArray, Movie newMovie) {
        Movie [] tempArray = new Movie[currentMovieArray.length];
        tempArray = currentMovieArray;
        tempArray[tempArray.length - 1] = newMovie;

    }

    public void movieByCategory(Movie [] movieList, int selector) {
        for (int i = 0; i < movieList.length; i++) {

            if (selector == 1) {
                System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
            }

            if (selector == 2) {
                if (movieList[i].getCategory().equalsIgnoreCase("animated")){
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }

            if (selector == 3) {
                if (movieList[i].getCategory().equalsIgnoreCase("drama")){
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }

            if (selector == 4) {
                if (movieList[i].getCategory().equalsIgnoreCase("horror")){
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }
            if (selector == 5) {
                if (movieList[i].getCategory().equalsIgnoreCase("scifi")){
                    System.out.printf("%s: %s\n", movieList[i].getName(), movieList[i].getCategory());
                }
            }
        }
    }
}
