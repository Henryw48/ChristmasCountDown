public class CountRunner {
    public static void main (String [] args) {

        CountDown CountDownObject = new CountDown();

        System.out.println(CountDownObject.getDate("1", 1));
        System.out.println("And...");
        System.out.println("Christmas is on the 25th of December");

        CountDownObject.getDays();
    }
}