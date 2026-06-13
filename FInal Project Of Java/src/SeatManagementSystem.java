import java.util.ArrayList;

 class SeatManagementSystem {

    public static void main(String[] args) {

        ArrayList<String> seats = new ArrayList<>();

        seats.add("A1");
        seats.add("A2");
        seats.add("A3");

        System.out.println("Initial Seats: " + seats);

        seats.remove("A2");

        seats.add("A4");

        System.out.println("Updated Seats: " + seats);
    }
}