package cinema;

import java.util.ArrayList;
import java.util.List;

public class Hall {

    private String name;
    private List<Seat> seats;

    public Hall(String name) {
        this.name = name;
        this.seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

