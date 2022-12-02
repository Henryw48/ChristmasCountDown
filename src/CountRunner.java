import java.util.Scanner;

public class CountRunner {
    public static void main (String [] args) {

        CountDown CountDownObject = new CountDown();
        CountDown.getDate(3, 1);
        System.out.println(CountDownObject.CountDown());
    }
}