package user;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public class Addresse {
        String city;
        String country;
        String street;
        String postNumber;
        String homeNumber;

        public Addresse(String city, String country, String street, String postNumber, String homeNumber) {
            this.city = city;
            this.country = country;
            this.street = street;
            this.postNumber = postNumber;
            this.homeNumber = homeNumber;
        }
    }
}
