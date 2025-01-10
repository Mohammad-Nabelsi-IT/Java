public class Book extends LibraryItem{
    private String genre;
    public Book(int itemId, String title, String author, int publishedYear) {
        super(itemId, title, author, publishedYear);
    }

    public Book(int itemId, String title, String author, int publishedYear, String genre) {
        super(itemId, title, author, publishedYear);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString()+
                "genre='" + genre + '\'' +
                '}';
    }
}
