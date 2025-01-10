public class Event {
    private String eventName;
    private String eventDate;
    private String venue;
    private int ticketPrice;

    public Event(String eventName, String eventDate, String venue, int ticketPrice) {

        this.eventName = eventName;
        this.eventDate = eventDate;
        this.venue = venue;
        this.ticketPrice = ticketPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return
                "eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", venue='" + venue + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
