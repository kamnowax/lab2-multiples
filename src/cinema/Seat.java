package cinema;

public class Seat {

    private String number;
    private SeatStatus status;

    public Seat(String number) {
        this.number = number;
        this.status = SeatStatus.FREE;
    }

    public String getNumber() {
        return number;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void reserve() {
        this.status = SeatStatus.RESERVED;
    }

    public void sell() {
        this.status = SeatStatus.SOLD;
    }
}

