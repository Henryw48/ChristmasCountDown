public class CountDown {

    private int day;
    private String month;
    private int christmas;
    private int year;
    private int total;

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

    public CountDown() {
    christmas = 359;
    year = 2022;
    total = 0;
    }

    public String getDate(String m, int d) {
        /* gets the date of the user choice */
        month = m;
        day = d;
        return "Today is " + m + "/" + d + "/" + year;
    }

    public int getDays() {
        /* This is the method that will help implement the number of days till Christmas */
        switch (month) {
            case "1": {
                total = day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "2": {
                total = January + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "3": {
                total = (January + February) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "4": {
                total = (January + February + March) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "5": {
                total = (January + February + March + April) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "6": {
                total = (January + February + March + April + May) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "7": {
                total = (January + February + March + April + May + June) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "8": {
                total = (January + February + March + April + May + June + July) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "9": {
                total = (January + February + March + April + May + June + July + August) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "10": {
                total = (January + February + March + April + May + June + July + August + September) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            case "11": {
                total = (January + February + March + April + May + June + July + August + September + October) + day;
                int s = christmas - total;
                System.out.println("That means there are " + s + " days until Christmas");
                break;
            }
            default:
                if ((month.equals("12")) && (day >= 26 && day <= 31)) {
                    System.out.println("Uh oh! Christmas has passed");
                } else if ((day == 25)) {
                    System.out.println("SO THAT MEANS TODAY IS CHRISTMAS");
                } else {
                    total = (January + February + March + April + May + June + July + August + September + October + November) + day;
                    int s = christmas - total;
                    System.out.println("That means there are " + s + " days until Christmas");
                }
                break;
        }
        return 0;
    }
}


