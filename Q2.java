import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Centimeter value:");

        double cm ;
        double Totalinches;
        double inches;
        int feet;

        cm = scan.nextDouble();

        Totalinches = cm / 2.54 ;
        feet = (int)(Totalinches / 12);
        inches  = Totalinches %12;

        System.out.println(feet+" feet"+ inches +" inches");


    }
}
