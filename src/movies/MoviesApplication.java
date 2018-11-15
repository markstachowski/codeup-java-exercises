package movies;

import util.Input;
import java.util.Scanner;

public class MoviesApplication {

    private static void displayMovies(String filter) {
        Movie[] all = MoviesArray.findAll();
        if (filter.equals("all")) {
            for (Movie movie: all) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        } else {
            for(Movie movie: all) {
                if (movie.getCategory().equals(filter)) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
        }
    }

    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            Input input = new Input(sc);
            System.out.println("\nWhat would you like to do?\n" +
                    "__________________________\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n");
            System.out.print("Enter your choice: ");
            int choice = input.getInt();
            System.out.println();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    displayMovies("all");
                    break;
                case 2:
                    displayMovies("animated");
                    break;
                case 3:
                    displayMovies("drama");
                    break;
                case 4:
                    displayMovies("horror");
                    break;
                case 5:
                    displayMovies("scifi");
                    break;
            }
        } while (true);
    }
}