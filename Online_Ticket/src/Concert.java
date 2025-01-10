public class Concert extends Event{
   private String performers;
    public Concert(String eventName, String eventDate, String venue, int ticketPrice) {
        super(eventName, eventDate, venue, ticketPrice);
    }

    public Concert(String eventName, String eventDate, String venue, int ticketPrice, String performers) {
        super(eventName, eventDate, venue, ticketPrice);
        this.performers = performers;
    }

    public String getPerformers() {
        return performers;
    }

    public void setPerformers(String performers) {
        this.performers = performers;
    }

    @Override
    public String toString() {
        return super.toString()+
                "performers='" + performers + '\'' +
                '}';
    }
}
