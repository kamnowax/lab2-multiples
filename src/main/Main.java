package main;

import cinema.*;
import customer.Customer;
import screening.*;
import ticket.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Network
        CinemaNetwork network = new CinemaNetwork();

        // Cinema
        Cinema cinema = new Cinema("Kino Świat", "ul. Akademicka 5");
        network.addCinema(cinema);

        // Hall
        Hall hall1 = new Hall("Hall 1");
        Seat s1 = new Seat("H34");
        Seat s2 = new Seat("H35");
        Seat s3 = new Seat("H36");

        hall1.addSeat(s1);
        hall1.addSeat(s2);
        hall1.addSeat(s3);

        cinema.addHall(hall1);

        // Movie
        Movie movie = new Movie("Avatar Ogień i Popiół", 120);

        // Screening
        Screening screening = new Screening(
                movie,
                hall1,
                LocalDateTime.now().plusDays(1),
                ScreeningType.VIP
        );

        cinema.addScreening(screening);

        // Print programme
        cinema.printProgramme();

        // Reservation without account
        screening.reservePlaces(s1, s2);

        // Customer
        Customer customer = new Customer("Kamil Nowak");

        // Buy tickets
        screening.buyTickets(s1, s2);

        Ticket t1 = new Ticket(s1, screening);
        Ticket t2 = new Ticket(s2, screening);

        customer.addTicket(t1);
        customer.addTicket(t2);

        // Reservation with account
        Reservation reservation = new Reservation(List.of(s3), customer);

        System.out.println("Customer " + customer.getName() + " has tickets: "
                + customer.getTickets().size());
    }
}

