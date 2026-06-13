import java.util.ArrayList;

public class DriverManagement {

    public static void main(String[] args) {

        ArrayList<String> activeDrivers = new ArrayList<>();

        activeDrivers.add("Ram");
        activeDrivers.add("Hari");
        activeDrivers.add("Sita");

        System.out.println("Before Insertion: " + activeDrivers);

        activeDrivers.add(1, "Ramesh");

        System.out.println("After Insertion: " + activeDrivers);
    }
}