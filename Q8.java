import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the radius:");

        int r = scan.nextInt();

        double V = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.println("Volume is:"+V);






    }
}
