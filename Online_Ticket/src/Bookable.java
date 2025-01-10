import java.util.Date;

public interface Bookable {
    Ticket bookTickt(Event event , Customer customer , Date date);
}
