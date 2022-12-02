import java.util.Scanner;

public class CountRunner {
    public static void main (String [] args) {

        CountDown CountDownObject = new CountDown();
        CountDownObject.getDate(1, 1);
        System.out.println(CountDownObject.CountDown());
        CountDownObject.getDays();
    }
}