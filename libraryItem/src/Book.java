public class Book extends LibraryItem{
private String author;
private boolean isAvailable;

    public Book(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title);
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public Book(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    public void checkOut() {
        if (isAvailable) {
            System.out.println("Book is Available then check out");
            isAvailable = false;

        } else {
            System.out.println("Book is not Available you cant checkOut");
        }
    }

    @Override
    public void checkIn() {
        System.out.println("Thank you the Book now checkIn");
        isAvailable=true;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBook" +
                "\nauthor = " + author +
                "\nisAvailable = " + isAvailable;
    }
}
