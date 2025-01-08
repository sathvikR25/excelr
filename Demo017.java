
import java.util.Scanner;

public class Demo017 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a two-digit integer
        System.out.print("Enter a two-digit integer: ");
        int number = scanner.nextInt();

        // Split the integer into two digits
        int firstDigit = number / 10;
        int secondDigit = number % 10;

        // Calculate the sum of the two digits
        int sum = firstDigit + secondDigit;

        // Display the result
        System.out.println("The first digit is: " + firstDigit);
        System.out.println("The second digit is: " + secondDigit);
        System.out.println("The sum of the digits is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
