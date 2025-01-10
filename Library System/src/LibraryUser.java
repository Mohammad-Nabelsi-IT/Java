public class LibraryUser {
    private int userId;
    private String name;
    private String email;
    private String borrowedItems;

    public LibraryUser(int userId, String name, String email, String borrowedItems) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.borrowedItems = borrowedItems;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(String borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    @Override
    public String toString() {
        return
                "userId=" + userId +
                        ", name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", borrowedItems='" + borrowedItems + '\'' +
                        '}';
    }
}
