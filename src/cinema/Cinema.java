package cinema;

import screening.Screening;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String name;
    private String address;
    private List<Hall> halls;
    private List<Screening> screenings;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.halls = new ArrayList<>();
        this.screenings = new ArrayList<>();
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void printProgramme() {
        System.out.println("Programme for cinema: " + name);
        for (Screening screening : screenings) {
            System.out.println(screening);
        }
    }
}
