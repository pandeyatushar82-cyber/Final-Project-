class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
}

class ElectricTruck extends Vehicle {

    ElectricTruck(String brand) {
        super(brand); // Calls parent constructor
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class VehicleRegistration {

    public static void main(String[] args) {

        ElectricTruck truck = new ElectricTruck("Tesla");

        truck.display();
    }
}