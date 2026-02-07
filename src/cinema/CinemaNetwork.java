package cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaNetwork {

    private List<Cinema> cinemas;

    public CinemaNetwork() {
        this.cinemas = new ArrayList<>();
    }

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }
}
