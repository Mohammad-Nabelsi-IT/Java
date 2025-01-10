public class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private int publishedYear;

    public LibraryItem(int itemId, String title, String author, int publishedYear) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return
                "itemId=" + itemId +
                        ", title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", publishedYear='" + publishedYear + '\'' +
                        '}';
    }
}
