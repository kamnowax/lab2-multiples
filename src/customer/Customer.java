package customer;

import ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Ticket> tickets;

    public Customer(String name) {
        this.name = name;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public String getName() {
        return name;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
