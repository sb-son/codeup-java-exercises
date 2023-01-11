package movies;
import util.Input;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit" +
                "\n1 - View all movies" +
                "\n2 - View movies in the animated category" +
                "\n3 - View movies in the drama category" +
                "\n4 - View movies in the horror category" +
                "\n5 - View movies in the scifi category" +
                "\n6 - Add new movie to list\n");
        Input in = new Input();
        int userInput = in.getInt("Enter your choice:");

        switch (userInput) {
            case 0:
                System.out.println("Thanks for checking out my movie application!");
                break;
            case 1:
                String titles = "Titles";
                String categories = "Categories";
                System.out.printf("%s | %s%n", titles, categories);
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.printf("%s | %s%n", movie.getName(), movie.getCategory());
                }
                break;
            case 2:
                System.out.println("You chose to view movies in the animated category");
                for (Movie animatedMovie : MoviesArray.findAll()) {
                    if (animatedMovie.getCategory().equals("animated")) {
                        System.out.printf("%s | %s%n", animatedMovie.getName(), animatedMovie.getCategory());
                    }
                }
                break;
            case 3:
                System.out.println("View movies in the drama category");
                for (Movie dramaMovie : MoviesArray.findAll()) {
                    if (dramaMovie.getCategory().equals("drama")) {
                        System.out.printf("%s | %s%n", dramaMovie.getName(), dramaMovie.getCategory());
                    }
                }
                break;
            case 4:
                System.out.println("You chose to view movies in the horror category");
                for (Movie horrorMovie : MoviesArray.findAll()) {
                    if (horrorMovie.getCategory().equals("horror")) {
                        System.out.printf("%s | %s%n", horrorMovie.getName(), horrorMovie.getCategory());
                    }
                }
                break;
            case 5:
                System.out.println("You chose to view movies in the scifi category");
                for (Movie scifiMovie : MoviesArray.findAll()) {
                    if (scifiMovie.getCategory().equals("scifi")) {
                        System.out.printf("%s | %s%n", scifiMovie.getName(), scifiMovie.getCategory());
                    }
                }
                break;
            case 6:
                System.out.println("What movie name would you like to enter: ");
                break;
        }

    }
}
