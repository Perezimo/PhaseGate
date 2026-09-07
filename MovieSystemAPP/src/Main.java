import movieRating.MovieRating;

import java.util.Scanner;

public class Main {
    static void main() {
        String menu = """
                1. Add a Movie
                2. Rate a Movie
                3. View Average Rating
                4. Exit
                Enter your choice:
                """;
        Scanner scanner = new Scanner(System.in);
        MovieRating movieRating = new MovieRating();
        boolean option = true;
        while (option){
            System.out.println(menu);
            if (!scanner.hasNextInt()) {
                System.out.println("Enter valid option!!!");
                scanner.nextLine();
                continue;
            }
            int choice = scanner.nextInt();

            scanner.nextLine();
            switch (choice){
                case 1->{
                    System.out.println("Enter the movie name: ");
                    String movieName = scanner.nextLine();
                    movieRating.addMovie(movieName);
                    System.out.println("Movie " + movieName + " " + "added!");
                }
                case 2->{
                    System.out.println("Enter the movie name: ");
                    String movieName = scanner.nextLine();
                    System.out.println("Enter your rating(1-5): ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();
                    movieRating.rateMovie(movieName, rating);
                }
                case 3->{
                    System.out.println("Average Ratings:");
                    for(int count=0;count< movieRating.checkNumberOfMovieAvailable(); count++){
                        System.out.println("- " + movieRating.getMovies().get(count) + ": " );
                        System.out.println(movieRating.getMovieAverage(movieRating.getMovies().get(count)));
                    }
                }
                case 4 -> {
                	System.out.println("Exiting the application. Goodbye!");
                    option = false;
                }
            }
        }
    }
}
