
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input Weight
        System.out.println("Enter your Weight(Kg:)");
        int Weight = scan.nextInt();

       //input height
        System.out.println("Enter your height(cm):");
        int Height = scan.nextInt();

        double HeightCm = Height /100.0;
        double BMI = Weight / (HeightCm * HeightCm);

        System.out.println("Your BMI value is:"+ BMI);

        if(BMI>=20 && BMI <= 25){
            System.out.println("Normal");

        }

        else if(BMI>25){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Under weight");
        }


    }
}
