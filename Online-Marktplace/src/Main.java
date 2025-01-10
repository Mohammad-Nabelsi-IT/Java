public class Main {
    public static void main(String[] args) {
        Electro e = new Electro("TV", 1000, "Samsung", 55);
        System.out.println(e);
        System.out.println("=====================");
        Books b = new Books("The Moon", 25, "VHS", "Khaled Ali", "Educational");
        System.out.println(b);
        System.out.println("=====================");
        Clothing c = new Clothing("T-shirt", 20, "Adidas", 40, "White");
        System.out.println(c);
        System.out.println("=====================");
        Product[] products = {e, b, c};
        Buyer buyer = new Buyer("Mohammad", "mnbvc@gmai.com", "lkj132465", products);
        System.out.println(buyer);
        System.out.println("=====================");
        Seller seller = new Seller("Ali", "sada@gmail.com", "qwer12346", products);
        System.out.println(seller);
    }
}
