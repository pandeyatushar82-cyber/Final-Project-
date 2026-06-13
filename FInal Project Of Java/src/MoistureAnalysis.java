public class MoistureAnalysis {

    public static void main(String[] args) {

        double[] moistureLogs = {42.0, 44.0, 46.0, 48.0, 43.0, 45.0, 47.0};

        double target = 45.0;
        double totalVariance = 0;

        for (int i = 0; i < moistureLogs.length; i++) {
            totalVariance += Math.abs(moistureLogs[i] - target);
        }

        System.out.println("Total Variance = " + totalVariance);

        if (totalVariance > 10) {
            System.out.println("Decision Code: HIGH");
        } else {
            System.out.println("Decision Code: NORMAL");
        }
    }
}