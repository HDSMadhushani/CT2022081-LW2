import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double loan = sc.nextDouble();

        System.out.print("Interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Years: ");
        int years = sc.nextInt();

        double mRate = rate / 100.0 / 12;
        int months = years * 12;

        double monthly = (loan * mRate) /
                (1 - Math.pow(1 / (1 + mRate), months));

        double total = monthly * months;

        System.out.println("Monthly Payment = " + monthly);
        System.out.println("Total Payment = " + total);
    }
}