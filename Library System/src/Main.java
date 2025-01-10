public class Main {
    public static void main(String[] args) {
        Book b=new Book(80,"the Word","Marks",1890,"History");
        Book b1=new Book(85,"the Sun","Jon s",1999,"History");

        System.out.println(b);
        System.out.println(b1);

        Journal j=new Journal(202,"News","Adam",2024);
        System.out.println(j);

        Dvd d=new Dvd(22,"pm3","Fairouz",1977,60);
        Dvd d1=new Dvd(100,"pm3","Madonna",1980,120);

        System.out.println(d);
        System.out.println(d1);
        System.out.println("**************");
        Library Lb=new Library();
        LibraryUser Lb1=new LibraryUser(66,"Ali","a@gmail.com","Book");
        System.out.println(Lb1);
        System.out.println("*************");
        LibraryUser Lb2=new LibraryUser(616,"lila","l@gmail.com","DVD");
        LibraryUser Lb3=new LibraryUser(66,"Sara","a@gmail.com","Journal");
        Library library = new Library();
        Library.ItemCatalog itemCatalog = library.new ItemCatalog();

        itemCatalog.addItem(b);
        itemCatalog.addItem(j);
        itemCatalog.addItem(d);

        System.out.println("************");
        itemCatalog.listItems();
        System.out.println("*******************************");
        Library.UserRegistry lu=Lb.new UserRegistry();
        lu.addUser(Lb1);
        lu.addUser(Lb2);
        lu.addUser(Lb3);

        Library.BorrowingManager borrowingManager = library.new BorrowingManager();
        LibraryItem forMohamed =  borrowingManager.borrowItem(Lb1 , "the Word");
        System.out.println("--------------------------");
        System.out.println( borrowingManager.borrowItem(Lb2 , "the Word"));
        borrowingManager.returnItem(Lb1 , forMohamed);
        System.out.println("--------------------------");
        System.out.println( borrowingManager.borrowItem(Lb2 , "the Word"));

    }
}
