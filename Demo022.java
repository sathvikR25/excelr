
import java.util.Scanner;

public class Demo022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // Year is divisible by 100
                if (year % 400 == 0) {
                    // Year is divisible by 400
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
