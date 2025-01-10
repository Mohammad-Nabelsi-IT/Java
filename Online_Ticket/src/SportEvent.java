public class SportEvent extends Event{
    private String sportTeam;
    public SportEvent(String eventName, String eventDate, String venue, int ticketPrice) {
        super(eventName, eventDate, venue, ticketPrice);
    }

    public SportEvent(String eventName, String eventDate, String venue, int ticketPrice, String sportTeam) {
        super(eventName, eventDate, venue, ticketPrice);
        this.sportTeam = sportTeam;
    }

    public String getSportTeam() {
        return sportTeam;
    }

    public void setSportTeam(String sportTeam) {
        this.sportTeam = sportTeam;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sportTeam='" + sportTeam + '\'' +
                '}';
    }
}
