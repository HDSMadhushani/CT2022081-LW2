import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter year of born:");

        int year = scn.nextInt();


        Date today = new Date( );
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

        int CurrentYear = Integer.parseInt(sdf.format(today));

        int Age = CurrentYear - year ;

        System.out.println("Your born year = "+year+"\nYour age = "+Age);


    }
}
