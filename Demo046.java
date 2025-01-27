/*/Java program to check if a year is a leap year or not */

import java.util.Scanner;

public class Demo046 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = s1.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
