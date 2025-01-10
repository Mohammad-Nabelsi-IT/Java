public class Dvd extends LibraryItem{
    private double duration;
    public Dvd(int itemId, String title, String author, int publishedYear) {
        super(itemId, title, author, publishedYear);
    }

    public Dvd(int itemId, String title, String author, int publishedYear, double duration) {
        super(itemId, title, author, publishedYear);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString()+
                "duration=" + duration +
                '}';
    }
}
