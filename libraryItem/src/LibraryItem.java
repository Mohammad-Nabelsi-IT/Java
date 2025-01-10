public abstract class LibraryItem {
    private String itemId;
    private String title;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void checkOut();

    public abstract void checkIn();

    @Override
    public String toString() {
        return "LibraryItem" +
                "\nitemId = " + itemId +
                "\ntitle = " + title;
    }
}
