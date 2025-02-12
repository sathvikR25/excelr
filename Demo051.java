//Write a Java program to check if a number is palindrome or not

import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0, original = number;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        scanner.close();
    }
}