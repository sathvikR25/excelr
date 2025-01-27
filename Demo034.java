/*program to check if a number is even or odd */

import java.util.Scanner;

public class Demo034 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = s1.nextInt();

        if (num % 2 == 0) {
            System.out.println("The Number " + num + " is Even");
        } else if (num % 2 != 0) {
            System.out.println("The Nummber " + num + " is Odd");
        }
    }
}
