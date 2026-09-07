package movieRating;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class MovieRating {

    ArrayList<String> movies = new ArrayList<>();
    ArrayList<LocalDateTime> movieDates = new ArrayList<>();
    ArrayList<ArrayList<Integer>> movieRatings = new ArrayList<>();
    public void addMovie(String title) {
        for(String movie:movies){
            if (movie.equalsIgnoreCase(title)){
                return;
            }
        }
        movies.add(title);
        movieDates.add(LocalDateTime.now());
        movieRatings.add(new ArrayList<>());
    }

    public int checkNumberOfMovieAvailable() {
        return movies.size();
    }

    public LocalDateTime checkDate(String title) {
        LocalDateTime time = LocalDateTime.now();
        for(int count = 0;count <checkNumberOfMovieAvailable(); count++){
            if(movies.get(count) == title){
                time = movieDates.get(count);
            }
        }
        return time;
    }


    public void rateMovie(String title, int rate) {
        if(rate > 5 || rate < 0) System.out.println("Ratings must be in the range of 1 - 5!!!");
        else {
            for (int count = 0; count < checkNumberOfMovieAvailable(); count++) {
                if (movies.get(count).equals(title)) {
                    movieRatings.get(count).add(rate);
                }
            }
            System.out.println("Rating added for: " + title + " " + rate);
        }
    }

    public ArrayList<Integer> getRating(String title) {
        ArrayList<Integer> ratings = new ArrayList<>();
        for(int count = 0;count <checkNumberOfMovieAvailable(); count++){
            if(movies.get(count) == title){
                ratings = movieRatings.get(count);
            }
        }
        return ratings;
    }


    public double getMovieAverage(String title) {
        double averageRating = 0;
        int noOfRatings = 0;
        for(int count = 0;count <checkNumberOfMovieAvailable(); count++){
            if(movies.get(count).equals(title)){
                for(noOfRatings = 0; noOfRatings<movieRatings.get(count).size(); noOfRatings++){
                    averageRating+=movieRatings.get(count).get(noOfRatings);
                }
            }
        }
        return averageRating/noOfRatings;
    }

    public double getMoviesAverage() {
        double averageRating = 0;
        int noOfRating = 0;
        int noOfRatings = 0;
        for(int count = 0;count <checkNumberOfMovieAvailable(); count++) {
            for (noOfRating = 0; noOfRating < movieRatings.get(count).size(); noOfRating++) {
                averageRating += movieRatings.get(count).get(noOfRating);
            }
            noOfRatings+=noOfRating;
        }
        return averageRating/noOfRatings;
    }
    public ArrayList<String> getMovies(){
        return movies;
    }
}
