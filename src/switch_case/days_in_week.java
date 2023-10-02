package switch_case;

import java.util.Scanner;

public class days_in_week {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number between 1-7");
        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter the valid day number ");
//        }
//
        // finding weekdays and weekends
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");
            case 6, 7 -> System.out.println("Weekends");
        }

    }
}
