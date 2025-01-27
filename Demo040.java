/*Java program to check if a character is lowercase, uppercase, a digit, or special */

import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char a = s1.nextLine().charAt(0);

        if (a >= 'a' && a <= 'z') {
            System.out.println("The Character is lowercase.");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("The Character is uppercase.");
        } else if (a >= '0' && a <= '9') {
            System.out.println("The input is a digit.");
        } else {
            System.out.println("The input is a special character.");
        }
    }
}
