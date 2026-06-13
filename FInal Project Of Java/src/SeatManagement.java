import java.util.ArrayList;

public class SeatManagement {

    public static void main(String[] args) {

        ArrayList<String> seats = new ArrayList<>();

        // Add seats
        seats.add("A1");
        seats.add("A2");
        seats.add("A3");

        System.out.println("Initial Seats: " + seats);

        // Cancel seat A2
        seats.remove("A2");

        // Add new seat
        seats.add("A4");

        System.out.println("Updated Seats: " + seats);
    }
}