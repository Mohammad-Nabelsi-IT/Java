public class Main {
    public static void main(String[] args) {
        Book b =new Book("123456","The Davinci Code","Mohammad Nabelsi",true);
        System.out.println(b);
        b.checkOut();
        b.checkIn();
        System.out.println("========================");
        Dvd d =new Dvd("456","New Song","Mohammad Nabelsi",false);
        System.out.println(d);
        d.checkOut();
        d.checkIn();


    }
}
