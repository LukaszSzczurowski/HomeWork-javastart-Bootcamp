package zajecia06.staticcalendar;

public class CalendarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        String dayString;
        switch (dayNumber) {
            case 1:
                dayString = "Poniedziałek";
                break;
            case 2:
                dayString = "Wtorek";
                break;
            case 3:
                dayString = "Środa";
                break;
            case 4:
                dayString = "Czwartek";
                break;
            case 5:
                dayString = "Piątek";
                break;
            case 6:
                dayString = "Sobota";
                break;
            case 7:
                dayString = "Niedziela";
                break;
            default:
                dayString = "undefined";
        }
        return dayString;
    }
}
