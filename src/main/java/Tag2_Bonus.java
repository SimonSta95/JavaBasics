import java.util.Calendar;
import java.util.Scanner;

public class Tag2_Bonus {

    static String[][] weekdays = {
            {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"},
            {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"},
            {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
    };

    static String[] months = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //year chooser
        System.out.print("Enter your year: ");
        int year = scanner.nextInt();

        //language chooser
        System.out.print("Choose your language(0 for German, 1 for English Short, 2 for English Long): ");
        int lang = scanner.nextInt();

        int cWidth = lang == 0 ? 2 : (lang == 1 ? 3 : 6);

        //check for leap year
        boolean isLeapYear = isLeapYear(year);

        //calc first day of the year
        int firstDayOfYear = getFirstDayOfYear(year);

        //build calendar
        for(int month = 0; month < 12; month++) {
            System.out.print("\n" + months[month] + "\n");
            printDays(weekdays[lang],cWidth);
            printMonth(month, firstDayOfYear, cWidth, isLeapYear);
        }

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JANUARY, 1);
        return (calendar.get(Calendar.DAY_OF_WEEK) + 5) % 7;
    }

    public static void printDays(String[] weekdays, int columnWidth) {
        for (String day : weekdays) {
            System.out.print(padRight(day, columnWidth) + " ");
        }
        System.out.println();
    }

    public static void printMonth(int month, int firstDayOfYear, int columnWidth, boolean isLeapYear) {
        int daysInMonth = getDaysInMonth(month, isLeapYear);
        int dayOfWeek = (firstDayOfYear + getDaysUpToMonth(month, isLeapYear)) % 7;

        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print(padRight("", columnWidth) + " ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(padRight(Integer.toString(day), columnWidth) + " ");
            dayOfWeek++;
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        return switch (month) {
            case 1 -> isLeapYear ? 29 : 28; // February
            case 3, 5, 8, 10 -> 30; // April, June, September, November
            default -> 31; // January, March, May, July, August, October, December
        };
    }

    public static int getDaysUpToMonth(int month, boolean isLeapYear) {
        int[] daysInMonth = {31, isLeapYear ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        for (int i = 0; i < month; i++) {
            days += daysInMonth[i];
        }
        return days;
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}


