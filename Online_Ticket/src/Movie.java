public class Movie extends Event {
    private String movieDirector;

    public Movie(String eventName, String eventDate, String venue, int ticketPrice) {
        super(eventName, eventDate, venue, ticketPrice);
    }

    public Movie(String eventName, String eventDate, String venue, int ticketPrice, String movieDirector) {
        super(eventName, eventDate, venue, ticketPrice);
        this.movieDirector = movieDirector;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    @Override
    public String toString() {
        return super.toString()+
                "movieDirector='" + movieDirector + '\'' +
                '}';
    }
}
