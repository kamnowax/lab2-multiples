package screening;

import cinema.Hall;
import cinema.Seat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Screening {

    private Movie movie;
    private Hall hall;
    private LocalDateTime dateTime;
    private ScreeningType type;

    private List<Seat> reservedSeats = new ArrayList<>();

    public Screening(Movie movie, Hall hall, LocalDateTime dateTime, ScreeningType type) {
        this.movie = movie;
        this.hall = hall;
        this.dateTime = dateTime;
        this.type = type;
    }

    public void reservePlaces(Seat... seats) {
        for (Seat seat : seats) {
            seat.reserve();
            reservedSeats.add(seat);
        }
    }

    public void buyTickets(Seat... seats) {
        for (Seat seat : seats) {
            seat.sell();
        }
    }

    @Override
    public String toString() {
        return movie.getTitle() + " (" + type + ") at " + dateTime + " in hall " + hall.getName();
    }
}
