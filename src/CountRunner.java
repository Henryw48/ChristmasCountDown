import java.util.Scanner;

public class CountRunner {
    public static void main (String [] args) {

        System.out.print("Enter Date: ");
        Scanner scan = new Scanner(System.in);
        int date = scan.nextInt();
        date = date /10000;
        int month = date /10;

        System.out.println("There are " + days + "until Christmas");
    }
}