public class InterestCalculator {

    static double calculateInterest(double principal, double rate, int time) {

        double amount = principal * Math.pow((1 + rate / 100), time);

        return amount;
    }

    public static void main(String[] args) {

        double result = calculateInterest(10000, 10, 2);

        System.out.println("Final Amount: " + result);
    }
}
