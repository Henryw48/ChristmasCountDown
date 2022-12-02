public class CountDown {


    private int day;
    private int month;

    private int christmas = 359;

    final int year = 2022;

    /* These are the months and how many days are in each month */
    int January = 31;
    int February = 28;
    int March = 31;
    int April = 30;
    int May = 31;
    int June = 30;
    int July = 31;
    int August = 31;
    int September = 30;
    int October = 31;
    int November = 30;
    int December = 31;


    public void getDate(int m, int d) {
        /* gets the date of the user choice */
        month = m;
        day = d;
        System.out.println("Today is " + m + "/" + d + "/" + year);
    }

    public String CountDown() {
        /* Initializes Date to the day of Christmas */
        day = 25;
        return "Christmas is on the " + day + "th day of December";
    }

    public int getDays() {
        /* This is the method that will help implement the number of days till Christmas */
        if (month == 1) {
            int day = (January - this.day);
            System.out.println("Date is January" + day);
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
        else {
            System.out.println("Date is December");
        }
        return 0;
    }

    public void afterChristmas() {
        /* Any days that the user implements after Christmas will activate this method */
        if ((month == 12) && (day >= 26 && day <= 31)) {
            System.out.println("Uh oh! Christmas has passed");
        }
    }
}


