//Write a Java program to count the number of digits of a number

import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int digitCount = (number == 0) ? 1 : 0;

        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        System.out.println("The number of digits is: " + digitCount);
    }
}