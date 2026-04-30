import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double Celsius = scan.nextDouble();

        double  Fahrenheit  = (1.8 * Celsius )+ 32;

        System.out.println(Celsius + "C" + " = " +Fahrenheit +"F");


    }

}

