class VideoTape {
    private String title;
    private int length;
    private boolean available;

    public VideoTape(String title, int length) {
        this.title = title;
        this.length = length;
        this.available = true;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

class Movie extends VideoTape {
    private String director;
    private String rating;

    public Movie(String title, int length, String director, String rating) {
        super(title, length);
        this.director = director;
        this.rating = rating;
    }

    public void show() {
        super.show();
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
    }
}

class MusicVideo extends VideoTape {
    private String artist;
    private String category;

    public MusicVideo(String title, int length, String artist, String category) {
        super(title, length);
        this.artist = artist;
        this.category = category;
    }

    public void show() {
        super.show();
        System.out.println("Artist: " + artist);
        System.out.println("Category: " + category);
    }
}

public class VideoHierarchy {
    public static void main(String[] args) {
        Movie movie = new Movie("The Shawshank Redemption", 142, "Frank Darabont", "PG-13");
        movie.show();
        System.out.println();

        MusicVideo musicVideo = new MusicVideo("Shape of You", 231, "Ed Sheeran", "Pop");
        musicVideo.show();
    }
}