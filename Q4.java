import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your weight:");
        double bodyWeight = scn.nextDouble();
        double calories = bodyWeight * 19;

        System.out.println("Number of calories:"+calories+"Cal");
    }

}
