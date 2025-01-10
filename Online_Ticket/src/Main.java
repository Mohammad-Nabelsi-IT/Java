import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Move F1", "25.10.2024", "Damascus", 75);
        Customer c1 = new Customer("132", "Mohammad", "majv@gmail.com");
        BookingSystem bs = new BookingSystem();
        bs.addEvent(m1);
        BookingSystem.BookingManager bm = bs.new BookingManager();
        Ticket t = bm.bookTickt(m1, c1, new Date());
        Ticket t2 = bm.bookTickt(m1, c1, new Date());
        Ticket t3 = bm.bookTickt(m1, c1, new Date());
        System.out.println(t);
        BookingSystem.EventListing el = bs.new EventListing();
        el.printEvent();
        System.out.println("=====================");
        bm.cancelBooking(1);
        Customer c2 = new Customer("466", "Adam", "lidjvbd@jnkxj");
        bm.bookTickt(m1, c2, new Date());
        System.out.println("=======================");

        bm.cancelBooking(4);
        el.printTicket();

        el.printEvent();
        System.out.println("=======================");
        el.printTicket();

    }
}
