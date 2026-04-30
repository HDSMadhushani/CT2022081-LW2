import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in degrees Fahrenheit: ");
        double  Fahrenheit = scan.nextDouble();

        double Celsius = (5.0/9.0) * (Fahrenheit - 32);

        System.out.println(Fahrenheit+"F" +" = " + Celsius +"C");


    }


}
