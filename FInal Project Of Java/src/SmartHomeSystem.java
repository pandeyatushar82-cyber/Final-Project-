interface Appliance {

    void turnOn();

    void turnOff();
}

class SmartFan implements Appliance {

    public void turnOn() {
        System.out.println("Smart Fan Turned ON");
    }

    public void turnOff() {
        System.out.println("Smart Fan Turned OFF");
    }
}

class SmartLight implements Appliance {

    public void turnOn() {
        System.out.println("Smart Light Turned ON");
    }

    public void turnOff() {
        System.out.println("Smart Light Turned OFF");
    }
}

public class SmartHomeSystem {

    public static void main(String[] args) {

        Appliance fan = new SmartFan();
        Appliance light = new SmartLight();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
    }
}