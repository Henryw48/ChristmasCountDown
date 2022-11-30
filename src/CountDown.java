public class CountDown {

    private int day;
    private int month;

    String January = "31 Days";
    String February = "28 Days";
    String March = "31 Days";
    String April = "30 Days";
    String May = "31 Days";
    String June = "30 Days";
    String July = "31 Days";
    String August = "31 Days";
    String September = "30 Days";
    String October = "31 Days";
    String November = "30 Days";
    String December = "31 Days";


    public void getDate(int month, int day) {
        /* gets the date of the user choice */
    }
    
    public CountDown() {
        /* Initializes Date to the day of Christmas */
    }

    public void getDays() {
        /* This is the method that will help implement the number of days till Christmas */
    }

    public void afterChristmas() {
        /* Any days that the user implements after Christmas will activate this method */
        if ((month == 12) && (day >= 26 && day <= 31)) {
            System.out.println("Uh oh! Christmas has passed");
        }
    }
}


