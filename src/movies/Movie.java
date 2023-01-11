package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static Movie[] addMovie(Movie[] array, Movie newMovie) {
        Movie[] MoviesArray = Arrays.copyOf(array, array.length + 1);
        MoviesArray[array.length] = newMovie;
        return MoviesArray;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
