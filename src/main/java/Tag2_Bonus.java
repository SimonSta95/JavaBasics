import java.util.Scanner;

/*
TODO: Still missing the following :
  - Calculation of the weekday for January 1st of the year
  - Highlighting holidays, including movable holidays
  - Support for multiple languages
  - Variable column width (width 2 for Mo, width 3 for Mon, width 6 for Monday)
 */

public class Tag2_Bonus {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] offsetDays = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6}; // Example offsets

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        String input = scanner.nextLine();
        scanner.close();

        if(isLeapYear(Integer.parseInt(input))) {
            daysInMonth[1] = 30;
        }



        for (int i = 0; i < months.length; i++) {
            printCalendarForMonth(months[i], daysInMonth[i], offsetDays[i]);
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printCalendarForMonth(String monthName, int daysInMonth, int offsetDays) {
        System.out.println(monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        int day = 1;

        for (int i = 0; i < offsetDays; i++) {
            System.out.print("   ");
        }

        for (int i = offsetDays; i < 7; i++) {
            System.out.printf("%2d ", day);
            day++;
        }
        System.out.println();

        while (day <= daysInMonth) {
            for (int i = 0; i < 7; i++) {
                if (day <= daysInMonth) {
                    System.out.printf("%2d ", day);
                    day++;
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            if (day > daysInMonth) {
                break;
            }
        }
    }
}


