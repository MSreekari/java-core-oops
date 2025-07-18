package concepts.classes_and_objects;

// Displays movies that are streaming

class Movie{
    String title;
    String genre;
    double ratings;

    Movie(String title, String genre, double ratings){
        this.title = title;
        this.genre = genre;
        this.ratings = ratings;
    }
    public void playMovie(){
        System.out.println("Now Playing: " + title);
    }
}

public class MovieRatings {
    public static void main(String[] args) {
        Movie[] movies =  new Movie[3];
        movies[0] = new Movie("The Dark Knight", "Action", 9);
        movies[1] = new Movie("F1: The Movie", "Action, Drama", 9.5);
        movies[2] = new Movie("Pulp Fiction", "Crime", 8);

        System.out.println("-----Now Streaming-----");
        for(Movie m : movies){
            m.playMovie();
            System.out.println("Genre: " + m.genre);
            System.out.println("Ratings: " + m.ratings);
            System.out.println();
        }
    }
}
