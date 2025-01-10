public class Dvd extends LibraryItem {
    private String director;
    private boolean isAvailable;

    public Dvd(String itemId, String title, String director, boolean isAvailable) {
        super(itemId, title);
        this.director = director;
        this.isAvailable = isAvailable;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void checkOut() {
        if (isAvailable) {
            System.out.println("DVD is Available then check out");
            isAvailable = false;
        } else {
            System.out.println("DVD is not Available you cant checkOut");
        }
    }

    @Override
    public void checkIn() {
        System.out.println("Thank you the Book now checkIn");
        isAvailable = true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDvd" +
                "\ndirector = " + director +
                "\nisAvailable = " + isAvailable;
    }
}
