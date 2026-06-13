import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter body fat percentage: ");
        int fat = sc.nextInt();



        if (fat < 14) {
            System.out.println("Athletic");
        } else if (fat <= 24) {
            System.out.println("Fit");
        } else {
            System.out.println("Regular");
        }
    }
}