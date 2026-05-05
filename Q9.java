import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter principal amount (P): ");
        double P = scan.nextDouble();

        System.out.print("Enter interest rate (R %): ");
        double R = scan.nextDouble();

        System.out.print("Enter number of years (N): ");
        int N = scan.nextInt();

        double amount = P * Math.pow((1 + (R / 100.0)), N);

        double earned = amount - P;

        System.out.println("Final Amount: " + amount);
        System.out.println("Money Earned: " + earned);

    }
}