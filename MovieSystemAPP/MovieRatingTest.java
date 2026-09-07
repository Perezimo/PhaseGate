package movieRating;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MovieRatingTest {
    @Test
    public void testThatICanAddAMovie(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        assertEquals(1, movieRating.checkNumberOfMovieAvailable());
    }

    @Test
    public void testThatMoreThanAMovieCanBeAdded(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        String titleOne = "Don Hahn";
        movieRating.addMovie(titleOne);
        assertEquals(2, movieRating.checkNumberOfMovieAvailable());
    }

    @Test
    public void testThatAMovieCanOnlyBeAddedOnce(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        String titleOne = "Lion King";
        movieRating.addMovie(titleOne);
        assertEquals(1, movieRating.checkNumberOfMovieAvailable());
    }

    @Test
    public void testThatMovieUploadedDate(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        assertNotNull(movieRating.checkDate(title));
    }
    @Test
    public void testThatMovieCanBeRated(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        movieRating.rateMovie(title, 4);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4));
        assertEquals(expected,movieRating.getRating(title));
    }

    @Test
    public void testThatAverageRatingForAMovieCanBeCalculated(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        movieRating.rateMovie(title, 4);
        movieRating.rateMovie(title, 2);
        movieRating.rateMovie(title, 5);
        movieRating.rateMovie(title, 3);
        movieRating.rateMovie(title, 4);
        assertEquals(3.6,movieRating.getMovieAverage(title));
    }

    @Test
    public  void testThatAverageRatingForMoviesCanBeCalculated(){
        MovieRating movieRating = new MovieRating();
        String title = "Lion King";
        movieRating.addMovie(title);
        movieRating.rateMovie(title, 4);
        movieRating.rateMovie(title, 2);
        movieRating.rateMovie(title, 5);
        movieRating.rateMovie(title, 3);
        movieRating.rateMovie(title, 4);
        String titleOne = "Don Hahn";
        movieRating.addMovie(titleOne);
        movieRating.rateMovie(titleOne, 3);
        movieRating.rateMovie(titleOne, 2);
        movieRating.rateMovie(titleOne, 1);
        assertEquals(3.0,movieRating.getMoviesAverage());

    }

}
