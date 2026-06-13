class Department {

    void checkBudgetStatus() {
        System.out.println("Budget is Normal");
    }
}

class ScienceDept extends Department {

    @Override
    void checkBudgetStatus() {
        System.out.println("Budget includes Laboratory Maintenance Fees");
    }
}

public class DepartmentDemo {

    public static void main(String[] args) {

        Department dept = new ScienceDept();

        dept.checkBudgetStatus();
    }
}