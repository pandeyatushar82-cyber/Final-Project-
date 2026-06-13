public class TemperatureAnalysis {

    public static void main(String[] args) {

        int[] temperatures = {25, 30, 28, 35, 27};

        int sum = 0;
        int max = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {

            sum += temperatures[i];

            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }

        double average = (double) sum / temperatures.length;

        System.out.println("Average Temperature: " + average);
        System.out.println("Highest Temperature: " + max);
    }
}