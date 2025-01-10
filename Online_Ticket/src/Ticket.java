import java.util.Arrays;
import java.util.Date;

public class Ticket {
    private int ticketId;
    private Event event;
    private Date bookingDate;
    private Customer customer;
    static int count = 0;

    public Ticket(Event event, Date bookingDate, Customer customer) {
        this.ticketId = ++count;
        this.event = event;
        this.bookingDate = bookingDate;
        this.customer = customer;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return
                "ticketId='" + ticketId + '\'' +
                        ", event=" + event +
                        ", bookingDate=" + bookingDate +
                        ", customer=" + customer +
                        '}';
    }
}
