package screening;

import cinema.Seat;
import customer.Customer;

import java.util.List;

public class Reservation {

    private List<Seat> seats;
    private Customer customer; // optional

    public Reservation(List<Seat> seats, Customer customer) {
        this.seats = seats;
        this.customer = customer;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Customer getCustomer() {
        return customer;
    }
}

