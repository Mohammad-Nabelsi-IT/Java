import java.util.Arrays;
import java.util.Date;

public class BookingSystem {
    public Event[] events;
    public Ticket[] tickets;

    public BookingSystem() {
        events = new Event[3];
        tickets = new Ticket[5];
    }

    public boolean addEvent(Event event) {
        for (int i = 0; i < events.length; i++) {
            if (events[i] == null) {
                events[i] = event;
            }
            return true;
        }
        return false;
    }

    public boolean removeEvent(String eventName) {
        for (int i = 0; i < events.length; i++) {
            if (events[i] != null && events[i].getEventName().equals(eventName)) {
                events[i] = null;
                return true;
            }
        }
        return false;
    }
    public class EventListing{
        void printEvent(){
            for (Event event: events){
                System.out.println(event);
            }
        }
        void printTicket(){
            for (Ticket ticket: tickets){
                System.out.println(ticket);
            }
        }
    }



    class BookingManager implements Bookable, Cancelable {


        @Override
        public Ticket bookTickt(Event event, Customer customer, Date date) {
            Ticket t1 = new Ticket(event, date, customer);
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] == null) {
                    tickets[i] = t1;
                    return t1;
                }

            }
            return null;
        }

        @Override
        public boolean cancelBooking(int ticketID) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] != null && tickets[i].getTicketId() == ticketID) {
                    tickets[i] = null;
                    return true;
                }

            }
            return false;
        }
    }

}