package ticket;

import cinema.Seat;
import screening.Screening;

public class Ticket {

    private Seat seat;
    private Screening screening;

    public Ticket(Seat seat, Screening screening) {
        this.seat = seat;
        this.screening = screening;
    }

    public Seat getSeat() {
        return seat;
    }

    public Screening getScreening() {
        return screening;
    }
}

