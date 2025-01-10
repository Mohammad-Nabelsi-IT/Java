public class Journal extends LibraryItem{
    private int volume;
    public Journal(int itemId, String title, String author, int publishedYear) {
        super(itemId, title, author, publishedYear);
    }

    public Journal(int itemId, String title, String author, int publishedYear, int volume) {
        super(itemId, title, author, publishedYear);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+
                "volume=" + volume +
                '}';
    }
}
