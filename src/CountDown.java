public class CountDown {

    private int day;
    private int month;


    /* These are the months and how many days are in each month */
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
        if (month == 1) {
            System.out.println("Date is January");
        }
        else if (month == 2) {
            System.out.println("Date is February");
        }
        else if (month == 3) {
            System.out.println("Date is March");
        }
        else if (month == 4) {
            System.out.println("Date is April");
        }
        else if (month == 5) {
            System.out.println("Date is May");
        }
        else if (month == 6) {
            System.out.println("Date is June");
        }
        else if (month == 7) {
            System.out.println("Date is July");
        }
        else if (month == 8) {
            System.out.println("Date is August");
        }
        else if (month == 9) {
            System.out.println("Date is September");
        }
        else if (month == 10) {
            System.out.println("Date is October");
        }
        else if (month == 11) {
            System.out.println("Date is November");
        }
        else if (month == 12) {
            System.out.println("Date is December");
        }
    }

    public void afterChristmas() {
        /* Any days that the user implements after Christmas will activate this method */
        if ((month == 12) && (day >= 26 && day <= 31)) {
            System.out.println("Uh oh! Christmas has passed");
        }
    }
}


