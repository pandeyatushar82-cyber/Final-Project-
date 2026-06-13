abstract class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }
}

class Consultant extends Employee {

    double percentage;

    Consultant(String name, double salary, double percentage) {
        super(name, salary);
        this.percentage = percentage;
    }

    @Override
    double calculateBonus() {
        return salary * percentage / 100;
    }
}

public class PayrollSystem {

    public static void main(String[] args) {

        Manager m = new Manager("Ram", 50000);
        Consultant c = new Consultant("Sita", 40000, 15);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        System.out.println("Consultant Bonus: " + c.calculateBonus());
    }
}